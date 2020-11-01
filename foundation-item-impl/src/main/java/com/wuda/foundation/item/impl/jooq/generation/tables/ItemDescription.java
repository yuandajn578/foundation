/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables;


import com.wuda.foundation.item.impl.jooq.generation.FoundationItem;
import com.wuda.foundation.item.impl.jooq.generation.Indexes;
import com.wuda.foundation.item.impl.jooq.generation.Keys;
import com.wuda.foundation.item.impl.jooq.generation.tables.records.ItemDescriptionRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * item的描述信息，通常作为详情的一个字段，但是，由于描述信息通常内容较多，很多orm框架都是select *，分开了可以避免查询出来（有时候根本就没用到），而且大数据量的字段更新性能较差，如果需要更新，会影响到核心item表，因此单独作为一个表保存。也可以表示物品某个规格的描述信息，如果variation 
 * id不等于0
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemDescription extends TableImpl<ItemDescriptionRecord> {

    private static final long serialVersionUID = -1726706308;

    /**
     * The reference instance of <code>foundation_item.item_description</code>
     */
    public static final ItemDescription ITEM_DESCRIPTION = new ItemDescription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemDescriptionRecord> getRecordType() {
        return ItemDescriptionRecord.class;
    }

    /**
     * The column <code>foundation_item.item_description.item_description_id</code>.
     */
    public final TableField<ItemDescriptionRecord, ULong> ITEM_DESCRIPTION_ID = createField(DSL.name("item_description_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_item.item_description.item_id</code>.
     */
    public final TableField<ItemDescriptionRecord, ULong> ITEM_ID = createField(DSL.name("item_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_item.item_description.item_variation_id</code>.
     */
    public final TableField<ItemDescriptionRecord, ULong> ITEM_VARIATION_ID = createField(DSL.name("item_variation_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>foundation_item.item_description.content</code>. 描述内容
     */
    public final TableField<ItemDescriptionRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.CLOB, this, "描述内容");

    /**
     * The column <code>foundation_item.item_description.create_time</code>.
     */
    public final TableField<ItemDescriptionRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_item.item_description.create_user_id</code>.
     */
    public final TableField<ItemDescriptionRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_item.item_description.last_modify_time</code>.
     */
    public final TableField<ItemDescriptionRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_item.item_description.last_modify_user_id</code>.
     */
    public final TableField<ItemDescriptionRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_item.item_description.is_deleted</code>.
     */
    public final TableField<ItemDescriptionRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_item.item_description</code> table reference
     */
    public ItemDescription() {
        this(DSL.name("item_description"), null);
    }

    /**
     * Create an aliased <code>foundation_item.item_description</code> table reference
     */
    public ItemDescription(String alias) {
        this(DSL.name(alias), ITEM_DESCRIPTION);
    }

    /**
     * Create an aliased <code>foundation_item.item_description</code> table reference
     */
    public ItemDescription(Name alias) {
        this(alias, ITEM_DESCRIPTION);
    }

    private ItemDescription(Name alias, Table<ItemDescriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ItemDescription(Name alias, Table<ItemDescriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("item的描述信息，通常作为详情的一个字段，但是，由于描述信息通常内容较多，很多orm框架都是select *，分开了可以避免查询出来（有时候根本就没用到），而且大数据量的字段更新性能较差，如果需要更新，会影响到核心item表，因此单独作为一个表保存。也可以表示物品某个规格的描述信息，如果variation id不等于0"), TableOptions.table());
    }

    public <O extends Record> ItemDescription(Table<O> child, ForeignKey<O, ItemDescriptionRecord> key) {
        super(child, key, ITEM_DESCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return FoundationItem.FOUNDATION_ITEM;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ITEM_DESCRIPTION_FK_ITEM_VARIATION_ID, Indexes.ITEM_DESCRIPTION_IDX_ITEM_ID);
    }

    @Override
    public Identity<ItemDescriptionRecord, ULong> getIdentity() {
        return Keys.IDENTITY_ITEM_DESCRIPTION;
    }

    @Override
    public UniqueKey<ItemDescriptionRecord> getPrimaryKey() {
        return Keys.KEY_ITEM_DESCRIPTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<ItemDescriptionRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemDescriptionRecord>>asList(Keys.KEY_ITEM_DESCRIPTION_PRIMARY);
    }

    @Override
    public ItemDescription as(String alias) {
        return new ItemDescription(DSL.name(alias), this);
    }

    @Override
    public ItemDescription as(Name alias) {
        return new ItemDescription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemDescription rename(String name) {
        return new ItemDescription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemDescription rename(Name name) {
        return new ItemDescription(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
