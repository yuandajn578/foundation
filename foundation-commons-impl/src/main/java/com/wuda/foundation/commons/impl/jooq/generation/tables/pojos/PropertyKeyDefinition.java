/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * property key 的定义，就好像是数据库表中列的定义是类似的
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyKeyDefinition implements Serializable {

    private static final long serialVersionUID = 1085300271;

    private ULong         propertyDefinitionId;
    private ULong         propertyKeyId;
    private String        dataType;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public PropertyKeyDefinition() {}

    public PropertyKeyDefinition(PropertyKeyDefinition value) {
        this.propertyDefinitionId = value.propertyDefinitionId;
        this.propertyKeyId = value.propertyKeyId;
        this.dataType = value.dataType;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public PropertyKeyDefinition(
        ULong         propertyDefinitionId,
        ULong         propertyKeyId,
        String        dataType,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.propertyDefinitionId = propertyDefinitionId;
        this.propertyKeyId = propertyKeyId;
        this.dataType = dataType;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getPropertyDefinitionId() {
        return this.propertyDefinitionId;
    }

    public void setPropertyDefinitionId(ULong propertyDefinitionId) {
        this.propertyDefinitionId = propertyDefinitionId;
    }

    public ULong getPropertyKeyId() {
        return this.propertyKeyId;
    }

    public void setPropertyKeyId(ULong propertyKeyId) {
        this.propertyKeyId = propertyKeyId;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyKeyDefinition (");

        sb.append(propertyDefinitionId);
        sb.append(", ").append(propertyKeyId);
        sb.append(", ").append(dataType);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
