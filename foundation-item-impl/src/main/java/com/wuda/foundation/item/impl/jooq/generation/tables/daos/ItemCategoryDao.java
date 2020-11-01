/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.daos;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCategory;
import com.wuda.foundation.item.impl.jooq.generation.tables.records.ItemCategoryRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;


/**
 * 物品分类
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemCategoryDao extends DAOImpl<ItemCategoryRecord, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory, ULong> {

    /**
     * Create a new ItemCategoryDao without any configuration
     */
    public ItemCategoryDao() {
        super(ItemCategory.ITEM_CATEGORY, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory.class);
    }

    /**
     * Create a new ItemCategoryDao with an attached configuration
     */
    public ItemCategoryDao(Configuration configuration) {
        super(ItemCategory.ITEM_CATEGORY, com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory object) {
        return object.getItemCategoryId();
    }

    /**
     * Fetch records that have <code>item_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfItemCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.ITEM_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>item_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByItemCategoryId(ULong... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.ITEM_CATEGORY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>item_category_id = value</code>
     */
    public com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory fetchOneByItemCategoryId(ULong value) {
        return fetchOne(ItemCategory.ITEM_CATEGORY.ITEM_CATEGORY_ID, value);
    }

    /**
     * Fetch records that have <code>parent_item_category_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfParentItemCategoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.PARENT_ITEM_CATEGORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>parent_item_category_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByParentItemCategoryId(ULong... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.PARENT_ITEM_CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>store_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfStoreId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.STORE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>store_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByStoreId(ULong... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.STORE_ID, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByName(String... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByDescription(String... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByCreateTime(LocalDateTime... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByCreateUserId(ULong... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByLastModifyUserId(ULong... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(ItemCategory.ITEM_CATEGORY.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.item.impl.jooq.generation.tables.pojos.ItemCategory> fetchByIsDeleted(ULong... values) {
        return fetch(ItemCategory.ITEM_CATEGORY.IS_DELETED, values);
    }
}
