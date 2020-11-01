/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 属性模板的挂载点，比如对于商品来说，相同分类下的商品属性很擂台，因此可以把属性模板挂载到商品分类上，在新建商品时就可以推荐相关的属性模板了
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyMount implements Serializable {

    private static final long serialVersionUID = -1377004522;

    private ULong         id;
    private ULong         propertyKeyId;
    private UByte         mountPointType;
    private ULong         mountPointIdenfier;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private ULong         isDeleted;

    public PropertyMount() {}

    public PropertyMount(PropertyMount value) {
        this.id = value.id;
        this.propertyKeyId = value.propertyKeyId;
        this.mountPointType = value.mountPointType;
        this.mountPointIdenfier = value.mountPointIdenfier;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.isDeleted = value.isDeleted;
    }

    public PropertyMount(
        ULong         id,
        ULong         propertyKeyId,
        UByte         mountPointType,
        ULong         mountPointIdenfier,
        LocalDateTime createTime,
        ULong         createUserId,
        ULong         isDeleted
    ) {
        this.id = id;
        this.propertyKeyId = propertyKeyId;
        this.mountPointType = mountPointType;
        this.mountPointIdenfier = mountPointIdenfier;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getPropertyKeyId() {
        return this.propertyKeyId;
    }

    public void setPropertyKeyId(ULong propertyKeyId) {
        this.propertyKeyId = propertyKeyId;
    }

    public UByte getMountPointType() {
        return this.mountPointType;
    }

    public void setMountPointType(UByte mountPointType) {
        this.mountPointType = mountPointType;
    }

    public ULong getMountPointIdenfier() {
        return this.mountPointIdenfier;
    }

    public void setMountPointIdenfier(ULong mountPointIdenfier) {
        this.mountPointIdenfier = mountPointIdenfier;
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

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PropertyMount (");

        sb.append(id);
        sb.append(", ").append(propertyKeyId);
        sb.append(", ").append(mountPointType);
        sb.append(", ").append(mountPointIdenfier);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
