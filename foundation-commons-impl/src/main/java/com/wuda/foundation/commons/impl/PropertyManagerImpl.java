package com.wuda.foundation.commons.impl;

import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyKeyRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyValueRecord;
import com.wuda.foundation.commons.property.AbstractPropertyManager;
import com.wuda.foundation.commons.property.CreatePropertyKeyDefinition;
import com.wuda.foundation.commons.property.CreatePropertyKey;
import com.wuda.foundation.commons.property.CreatePropertyKeyWithDefinition;
import com.wuda.foundation.commons.property.CreatePropertyValue;
import com.wuda.foundation.commons.property.DescribeProperty;
import com.wuda.foundation.commons.property.DescribePropertyDefinition;
import com.wuda.foundation.commons.property.DescribePropertyKey;
import com.wuda.foundation.commons.property.DescribePropertyValue;
import com.wuda.foundation.commons.property.PropertyKeyType;
import com.wuda.foundation.commons.property.PropertyKeyTypeSchema;
import com.wuda.foundation.commons.property.PropertyKeyUse;
import com.wuda.foundation.commons.property.PropertyKeyUseSchema;
import com.wuda.foundation.commons.property.UpdatePropertyValue;
import com.wuda.foundation.jooq.JooqCommonDbOp;
import com.wuda.foundation.jooq.JooqContext;
import com.wuda.foundation.lang.DataType;
import com.wuda.foundation.lang.InsertMode;
import com.wuda.foundation.lang.IsDeleted;
import com.wuda.foundation.lang.SingleInsertResult;
import com.wuda.foundation.lang.UniqueCodeDescriptorRegistry;
import com.wuda.foundation.lang.datatype.MySQLDataTypes;
import com.wuda.foundation.lang.identify.Identifier;
import com.wuda.foundation.lang.identify.IdentifierTypeRegistry;
import com.wuda.foundation.lang.identify.LongIdentifier;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.SelectConditionStep;
import org.jooq.impl.DSL;
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKey.PROPERTY_KEY;
import static com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyValue.PROPERTY_VALUE;

public class PropertyManagerImpl extends AbstractPropertyManager implements JooqCommonDbOp {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    protected DescribePropertyKey getPropertyKeyDbOp(Identifier<Long> owner, String key) {
        DSLContext dslContext = JooqContext.getOrCreateDSLContext(dataSource);
        PropertyKeyRecord propertyKeyRecord = dslContext.selectFrom(PROPERTY_KEY)
                .where(PROPERTY_KEY.OWNER_TYPE.eq(UByte.valueOf(owner.getType().getCode())))
                .and(PROPERTY_KEY.OWNER_IDENTIFIER.eq(ULong.valueOf(owner.getValue())))
                .and(PROPERTY_KEY.KEY.eq(key))
                .fetchOne();
        return from(propertyKeyRecord);
    }

    @Override
    protected long createPropertyValueDbOp(CreatePropertyValue createPropertyValue, InsertMode insertMode, Long opUserId) {
        long propertyKeyId = createPropertyValue.getPropertyKeyId();
        DescribePropertyDefinition describePropertyDefinition = getDefinitionByPropertyKey(propertyKeyId);
        DataType dataType = MySQLDataTypes.VARCHAR;
        List<PropertyValueRecord> values = getPropertyValue(propertyKeyId);
        long id;
        if (dataType.isCollection()) {
            PropertyValueRecord exists = propertyValueExists(values, createPropertyValue.getValue());
            if (exists != null) {
                id = exists.getPropertyValueId().longValue();
            } else {
                id = insertPropertyValueRecord(createPropertyValue, opUserId).getRecordId();
            }
        } else {
            if (values != null && !values.isEmpty()) {
                assert values.size() == 1 : "非集合类型的Property,value最多只能有一个";
                PropertyValueRecord propertyValueRecord = values.get(0);
                propertyValueRecord.setValue(createPropertyValue.getValue());
                attach(dataSource, propertyValueRecord);
                propertyValueRecord.update();
                id = propertyValueRecord.getPropertyValueId().longValue();
            } else {
                id = insertPropertyValueRecord(createPropertyValue, opUserId).getRecordId();
            }
        }
        return id;
    }

    @Override
    protected void directBatchInsertPropertyValueDbOp(List<CreatePropertyValue> createPropertyValues, Long opUserId) {
        List<PropertyValueRecord> records = newPropertyValueRecords(createPropertyValues, opUserId);
        batchInsert(dataSource, PROPERTY_VALUE, records);
    }

    private List<PropertyValueRecord> getPropertyValue(Long propertyKeyId) {
        DSLContext dslContext = JooqContext.getOrCreateDSLContext(dataSource);
        return dslContext.selectFrom(PROPERTY_VALUE)
                .where(PROPERTY_VALUE.PROPERTY_KEY_ID.eq(ULong.valueOf(propertyKeyId)))
                .and(PROPERTY_VALUE.IS_DELETED.eq(ULong.valueOf(IsDeleted.NO.getValue())))
                .fetch();
    }

    private PropertyValueRecord propertyValueExists(List<PropertyValueRecord> values, String value) {
        if (values == null || values.isEmpty()) {
            return null;
        }
        for (PropertyValueRecord propertyValueRecord : values) {
            if (value.equals(propertyValueRecord.getValue())) {
                return propertyValueRecord;
            }
        }
        return null;
    }

    @Override
    public DescribePropertyKey getPropertyKeyDbOp(Long id) {
        Configuration configuration = JooqContext.getConfiguration(dataSource);
        PropertyKeyRecord propertyKeyRecord = new PropertyKeyRecord();
        propertyKeyRecord.setPropertyKeyId(ULong.valueOf(id));
        propertyKeyRecord.attach(configuration);
        propertyKeyRecord.refresh();
        return from(propertyKeyRecord);
    }

    @Override
    protected long createPropertyKeyDbOp(CreatePropertyKeyWithDefinition createPropertyKeyWithDefinition, Long opUserId) {
        CreatePropertyKey createPropertyKey = createPropertyKeyWithDefinition.getPropertyKey();
        CreatePropertyKeyDefinition definition = createPropertyKeyWithDefinition.getDefinition();
        long actualPropertyKeyId = createPropertyKeyDbOp(createPropertyKey, InsertMode.INSERT_AFTER_SELECT_CHECK, opUserId);
        if (actualPropertyKeyId == createPropertyKey.getId()) {
            createPropertyDefinitionDbOp(definition, opUserId);
        }
        return actualPropertyKeyId;
    }

    @Override
    protected void directBatchInsertPropertyKeyDbOp(List<CreatePropertyKey> createPropertyKeys, Long opUserId) {
        List<PropertyKeyRecord> records = newPropertyKeyRecords(createPropertyKeys, opUserId);
        batchInsert(dataSource, PROPERTY_KEY, records);
    }

    @Override
    protected long createPropertyKeyDbOp(CreatePropertyKey createPropertyKey, InsertMode insertMode, Long opUserId) {
        Configuration configuration = JooqContext.getConfiguration(dataSource);
        SelectConditionStep<Record1<ULong>> existsRecordSelector = DSL.using(configuration)
                .select(PROPERTY_KEY.PROPERTY_KEY_ID)
                .from(PROPERTY_KEY)
                .where(PROPERTY_KEY.OWNER_TYPE.eq(UByte.valueOf(createPropertyKey.getOwner().getType().getCode())))
                .and(PROPERTY_KEY.OWNER_IDENTIFIER.eq(ULong.valueOf(createPropertyKey.getOwner().getValue())))
                .and(PROPERTY_KEY.KEY.eq(createPropertyKey.getKey()))
                .and(PROPERTY_KEY.IS_DELETED.eq(ULong.valueOf(IsDeleted.NO.getValue())));
        return insertDispatcher(dataSource, insertMode, PROPERTY_KEY, newPropertyKeyRecord(createPropertyKey, opUserId), existsRecordSelector).getRecordId();
    }

    @Override
    protected void updatePropertyValueDbOp(UpdatePropertyValue updatePropertyValue, Long opUserId) {
        PropertyValueRecord propertyValueRecord = propertyValueRecordForUpdate(updatePropertyValue, opUserId);
        propertyValueRecord.attach(JooqContext.getConfiguration(dataSource));
        propertyValueRecord.update();
    }

    @Override
    protected void directBatchUpdatePropertyValueDbOp(List<UpdatePropertyValue> updatePropertyValues, Long opUserId) {
        for (UpdatePropertyValue updatePropertyValue : updatePropertyValues) {
            updatePropertyValue(updatePropertyValue, opUserId);
        }
    }

    @Override
    protected List<DescribePropertyValue> getValueByPropertyKeyDbOp(Long propertyKeyId) {
        List<PropertyValueRecord> propertyValueRecords = getPropertyValue(propertyKeyId);
        return from(propertyValueRecords);
    }

    @Override
    protected DescribePropertyDefinition getDefinitionByPropertyKeyDbOp(Long propertyKeyId) {
        return null;
    }

    @Override
    protected DescribeProperty getPropertyDbOp(Identifier<Long> owner, String key) {
        DescribePropertyKey describePropertyKey = getPropertyKeyDbOp(owner, key);
        List<DescribePropertyValue> describePropertyValues = getValueByPropertyKeyDbOp(describePropertyKey.getId());
        DescribePropertyDefinition definition = getDefinitionByPropertyKeyDbOp(describePropertyKey.getId());
        return new DescribeProperty(describePropertyKey, describePropertyValues, definition);
    }

    @Override
    protected List<DescribeProperty> getPropertiesDbOp(Identifier<Long> owner) {
        ULong notDeleted = ULong.valueOf(IsDeleted.NO.getValue());
        DSLContext dslContext = JooqContext.getOrCreateDSLContext(dataSource);
        SelectConditionStep selectConditionStep = dslContext.select()
                .from(PROPERTY_KEY)
                .leftJoin(PROPERTY_VALUE).on(PROPERTY_VALUE.PROPERTY_KEY_ID.eq(PROPERTY_KEY.PROPERTY_KEY_ID)).and(PROPERTY_VALUE.IS_DELETED.eq(notDeleted))
                .where(PROPERTY_KEY.OWNER_TYPE.eq(UByte.valueOf(owner.getType().getCode())))
                .and(PROPERTY_KEY.OWNER_IDENTIFIER.eq(ULong.valueOf(owner.getValue())))
                .and(PROPERTY_KEY.IS_DELETED.eq(notDeleted));
        Result result = selectConditionStep.fetch();
        List<DescribeProperty> list = null;
        if (result != null && result.size() > 0) {
            Result<PropertyKeyRecord> propertyKeyRecords = result.into(PROPERTY_KEY);
            if (propertyKeyRecords != null && propertyKeyRecords.size() > 0) {
                list = new ArrayList<>();
                Result<PropertyValueRecord> propertyValueRecords = result.into(PROPERTY_VALUE);
                Map<ULong, List<PropertyValueRecord>> byPropertyKeyMap;
                if (propertyValueRecords != null) {
                    byPropertyKeyMap = propertyValueRecords.stream()
                            .filter(value -> value != null && value.getPropertyKeyId() != null)
                            .collect(Collectors.groupingBy(PropertyValueRecord::getPropertyKeyId));
                } else {
                    byPropertyKeyMap = new HashMap<>(1);
                }
                for (PropertyKeyRecord propertyKeyRecord : propertyKeyRecords) {
                    List<PropertyValueRecord> propertyValues = byPropertyKeyMap.get(propertyKeyRecord.getPropertyKeyId());
                    List<DescribePropertyValue> describePropertyValues = from(propertyValues);
                    DescribeProperty describeProperty = new DescribeProperty(from(propertyKeyRecord), describePropertyValues, null);
                    list.add(describeProperty);
                }
            }
        }
        return list;
    }

    @Override
    protected long createPropertyDefinitionDbOp(CreatePropertyKeyDefinition definition, Long opUserId) {
        return 0;
    }

    private PropertyValueRecord propertyValueRecordForUpdate(UpdatePropertyValue updatePropertyValue, Long opUserId) {
        PropertyValueRecord record = new PropertyValueRecord();
        record.setPropertyValueId(ULong.valueOf(updatePropertyValue.getId()));
        record.setValue(updatePropertyValue.getValue());
        record.setLastModifyTime(LocalDateTime.now());
        record.setLastModifyUserId(ULong.valueOf(opUserId));
        return record;
    }

    private DescribePropertyKey from(PropertyKeyRecord propertyKeyRecord) {
        DescribePropertyKey describePropertyKey = new DescribePropertyKey();
        describePropertyKey.setId(propertyKeyRecord.getPropertyKeyId().longValue());
        describePropertyKey.setKey(propertyKeyRecord.getKey());
        describePropertyKey.setOwner(new LongIdentifier(propertyKeyRecord.getOwnerIdentifier().longValue(),
                IdentifierTypeRegistry.defaultRegistry.lookup(propertyKeyRecord.getOwnerType().intValue())));
        PropertyKeyType propertyKeyType = UniqueCodeDescriptorRegistry.defaultRegistry.lookup(PropertyKeyTypeSchema.class, propertyKeyRecord.getType().intValue());
        describePropertyKey.setPropertyKeyType(propertyKeyType);
        PropertyKeyUse propertyKeyUse = UniqueCodeDescriptorRegistry.defaultRegistry.lookup(PropertyKeyUseSchema.class, propertyKeyRecord.getUse().intValue());
        describePropertyKey.setPropertyKeyUse(propertyKeyUse);
        return describePropertyKey;
    }

    private DescribePropertyValue from(PropertyValueRecord propertyValueRecord) {
        DescribePropertyValue describePropertyValue = new DescribePropertyValue();
        describePropertyValue.setId(propertyValueRecord.getPropertyValueId().longValue());
        describePropertyValue.setPropertyKeyId(propertyValueRecord.getPropertyKeyId().longValue());
        describePropertyValue.setValue(propertyValueRecord.getValue());
        return describePropertyValue;
    }

    private List<DescribePropertyValue> from(List<PropertyValueRecord> propertyValueRecords) {
        if (propertyValueRecords == null) {
            return null;
        }
        List<DescribePropertyValue> list = new ArrayList<>(propertyValueRecords.size());
        for (PropertyValueRecord propertyValueRecord : propertyValueRecords) {
            list.add(from(propertyValueRecord));
        }
        return list;
    }

    private PropertyValueRecord newPropertyValueRecord(CreatePropertyValue createPropertyValue, Long opUserId) {
        LocalDateTime now = LocalDateTime.now();
        return new PropertyValueRecord(ULong.valueOf(createPropertyValue.getId()),
                ULong.valueOf(createPropertyValue.getPropertyKeyId()),
                createPropertyValue.getValue(),
                now, ULong.valueOf(opUserId), now, ULong.valueOf(opUserId), ULong.valueOf(IsDeleted.NO.getValue()));
    }

    private List<PropertyValueRecord> newPropertyValueRecords(List<CreatePropertyValue> createPropertyValues, Long opUserId) {
        List<PropertyValueRecord> list = new ArrayList<>(createPropertyValues.size());
        for (CreatePropertyValue createPropertyValue : createPropertyValues) {
            list.add(newPropertyValueRecord(createPropertyValue, opUserId));
        }
        return list;
    }

    private SingleInsertResult insertPropertyValueRecord(CreatePropertyValue createPropertyValue, Long opUserId) {
        return insert(dataSource, PROPERTY_VALUE, newPropertyValueRecord(createPropertyValue, opUserId));
    }

    private PropertyKeyRecord newPropertyKeyRecord(CreatePropertyKey createPropertyKey, Long opUserId) {
        LocalDateTime now = LocalDateTime.now();
        return new PropertyKeyRecord(
                ULong.valueOf(createPropertyKey.getId()),
                createPropertyKey.getKey(),
                UByte.valueOf(createPropertyKey.getType().getCode()),
                UByte.valueOf(createPropertyKey.getOwner().getType().getCode()),
                ULong.valueOf(createPropertyKey.getOwner().getValue()),
                UByte.valueOf(createPropertyKey.getUse().getCode()),
                now, ULong.valueOf(opUserId), now, ULong.valueOf(opUserId), ULong.valueOf(IsDeleted.NO.getValue())
        );
    }

    private List<PropertyKeyRecord> newPropertyKeyRecords(List<CreatePropertyKey> createPropertyKeys, Long opUserId) {
        List<PropertyKeyRecord> list = new ArrayList<>(createPropertyKeys.size());
        for (CreatePropertyKey createPropertyKey : createPropertyKeys) {
            list.add(newPropertyKeyRecord(createPropertyKey, opUserId));
        }
        return list;
    }

}
