/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.item.impl.jooq.generation.tables.pojos;


import org.jooq.types.ULong;
import org.jooq.types.UShort;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 表示item所属的组。比如店铺是一种组，分类也是一种组，等等。item与所有的组的关系都记录在这个表里。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemBelongsToGroup implements Serializable {

    private static final long serialVersionUID = -107091517;

    private ULong         id;
    private ULong         itemId;
    private UShort        groupType;
    private ULong         groupIdentifier;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public ItemBelongsToGroup() {}

    public ItemBelongsToGroup(ItemBelongsToGroup value) {
        this.id = value.id;
        this.itemId = value.itemId;
        this.groupType = value.groupType;
        this.groupIdentifier = value.groupIdentifier;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public ItemBelongsToGroup(
        ULong         id,
        ULong         itemId,
        UShort        groupType,
        ULong         groupIdentifier,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.id = id;
        this.itemId = itemId;
        this.groupType = groupType;
        this.groupIdentifier = groupIdentifier;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public ULong getItemId() {
        return this.itemId;
    }

    public void setItemId(ULong itemId) {
        this.itemId = itemId;
    }

    public UShort getGroupType() {
        return this.groupType;
    }

    public void setGroupType(UShort groupType) {
        this.groupType = groupType;
    }

    public ULong getGroupIdentifier() {
        return this.groupIdentifier;
    }

    public void setGroupIdentifier(ULong groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
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
        StringBuilder sb = new StringBuilder("ItemBelongsToGroup (");

        sb.append(id);
        sb.append(", ").append(itemId);
        sb.append(", ").append(groupType);
        sb.append(", ").append(groupIdentifier);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}