/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.records;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCore;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 物品核心信息，代表所有的物品，之前有把用户ID放进来，表示该物品所属的用户，但是考虑到如果有子账号的情况，物品难道属于这个子账号所属的用户吗？而且记录了创建人用户ID，考虑这两个因素，因此不设置用户ID列
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemCoreRecord extends UpdatableRecordImpl<ItemCoreRecord> implements Record9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = -825872737;

    /**
     * Setter for <code>foundation_item.item_core.item_core_id</code>.
     */
    public void setItemCoreId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.item_core_id</code>.
     */
    public ULong getItemCoreId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_item.item_core.item_id</code>. item id
     */
    public void setItemId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.item_id</code>. item id
     */
    public ULong getItemId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_item.item_core.type</code>. 商品类型 . 不同类型的商品, 保存到各自不同的表中. 参考 https://learnwoo.com/woocommerce-different-product-types/
     */
    public void setType(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.type</code>. 商品类型 . 不同类型的商品, 保存到各自不同的表中. 参考 https://learnwoo.com/woocommerce-different-product-types/
     */
    public UByte getType() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>foundation_item.item_core.state</code>. 状态
     */
    public void setState(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.state</code>. 状态
     */
    public UByte getState() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>foundation_item.item_core.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>foundation_item.item_core.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>foundation_item.item_core.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_item.item_core.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_item.item_core.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_item.item_core.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return ItemCore.ITEM_CORE.ITEM_CORE_ID;
    }

    @Override
    public Field<ULong> field2() {
        return ItemCore.ITEM_CORE.ITEM_ID;
    }

    @Override
    public Field<UByte> field3() {
        return ItemCore.ITEM_CORE.TYPE;
    }

    @Override
    public Field<UByte> field4() {
        return ItemCore.ITEM_CORE.STATE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return ItemCore.ITEM_CORE.CREATE_TIME;
    }

    @Override
    public Field<ULong> field6() {
        return ItemCore.ITEM_CORE.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ItemCore.ITEM_CORE.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return ItemCore.ITEM_CORE.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return ItemCore.ITEM_CORE.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getItemCoreId();
    }

    @Override
    public ULong component2() {
        return getItemId();
    }

    @Override
    public UByte component3() {
        return getType();
    }

    @Override
    public UByte component4() {
        return getState();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public ULong component6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifyTime();
    }

    @Override
    public ULong component8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getItemCoreId();
    }

    @Override
    public ULong value2() {
        return getItemId();
    }

    @Override
    public UByte value3() {
        return getType();
    }

    @Override
    public UByte value4() {
        return getState();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public ULong value6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifyTime();
    }

    @Override
    public ULong value8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public ItemCoreRecord value1(ULong value) {
        setItemCoreId(value);
        return this;
    }

    @Override
    public ItemCoreRecord value2(ULong value) {
        setItemId(value);
        return this;
    }

    @Override
    public ItemCoreRecord value3(UByte value) {
        setType(value);
        return this;
    }

    @Override
    public ItemCoreRecord value4(UByte value) {
        setState(value);
        return this;
    }

    @Override
    public ItemCoreRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public ItemCoreRecord value6(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public ItemCoreRecord value7(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public ItemCoreRecord value8(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public ItemCoreRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public ItemCoreRecord values(ULong value1, ULong value2, UByte value3, UByte value4, LocalDateTime value5, ULong value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemCoreRecord
     */
    public ItemCoreRecord() {
        super(ItemCore.ITEM_CORE);
    }

    /**
     * Create a detached, initialised ItemCoreRecord
     */
    public ItemCoreRecord(ULong itemCoreId, ULong itemId, UByte type, UByte state, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(ItemCore.ITEM_CORE);

        set(0, itemCoreId);
        set(1, itemId);
        set(2, type);
        set(3, state);
        set(4, createTime);
        set(5, createUserId);
        set(6, lastModifyTime);
        set(7, lastModifyUserId);
        set(8, isDeleted);
    }
}
