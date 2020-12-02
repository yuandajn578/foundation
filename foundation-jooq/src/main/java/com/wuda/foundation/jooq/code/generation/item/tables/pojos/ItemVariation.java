/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.item.tables.pojos;


import org.jooq.types.UByte;
import org.jooq.types.ULong;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 规格。比如一件衣服，有红色，白色两种规格。具体的属性和值保存在MongoDB. 不能用属性ID关联, 而是要具体的属性名称和值, 避免关联的属性修改. 
 * 注意和SKU之间的区别.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemVariation implements Serializable {

    private static final long serialVersionUID = -1642457920;

    private ULong         itemVariationId;
    private ULong         itemId;
    private String        name;
    private UByte         state;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public ItemVariation() {}

    public ItemVariation(ItemVariation value) {
        this.itemVariationId = value.itemVariationId;
        this.itemId = value.itemId;
        this.name = value.name;
        this.state = value.state;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public ItemVariation(
        ULong         itemVariationId,
        ULong         itemId,
        String        name,
        UByte         state,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.itemVariationId = itemVariationId;
        this.itemId = itemId;
        this.name = name;
        this.state = state;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getItemVariationId() {
        return this.itemVariationId;
    }

    public void setItemVariationId(ULong itemVariationId) {
        this.itemVariationId = itemVariationId;
    }

    public ULong getItemId() {
        return this.itemId;
    }

    public void setItemId(ULong itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UByte getState() {
        return this.state;
    }

    public void setState(UByte state) {
        this.state = state;
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
        StringBuilder sb = new StringBuilder("ItemVariation (");

        sb.append(itemVariationId);
        sb.append(", ").append(itemId);
        sb.append(", ").append(name);
        sb.append(", ").append(state);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}