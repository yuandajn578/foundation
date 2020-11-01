/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.daos;


import com.wuda.foundation.commons.impl.jooq.generation.tables.AdministrativeUnit;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.AdministrativeUnitRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * 行政单元，行政区域划分。也就是省市区等数据，不按省市区建表，因为不一定是按那样划分，比如北京，深圳，但是他们有一个共同特点，那就是有上下级关系，因此用ID/PID的方式组织。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdministrativeUnitDao extends DAOImpl<AdministrativeUnitRecord, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit, UShort> {

    /**
     * Create a new AdministrativeUnitDao without any configuration
     */
    public AdministrativeUnitDao() {
        super(AdministrativeUnit.ADMINISTRATIVE_UNIT, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit.class);
    }

    /**
     * Create a new AdministrativeUnitDao with an attached configuration
     */
    public AdministrativeUnitDao(Configuration configuration) {
        super(AdministrativeUnit.ADMINISTRATIVE_UNIT, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit.class, configuration);
    }

    @Override
    public UShort getId(com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit object) {
        return object.getAdministrativeUnitId();
    }

    /**
     * Fetch records that have <code>administrative_unit_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfAdministrativeUnitId(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.ADMINISTRATIVE_UNIT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>administrative_unit_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByAdministrativeUnitId(UShort... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.ADMINISTRATIVE_UNIT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>administrative_unit_id = value</code>
     */
    public com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit fetchOneByAdministrativeUnitId(UShort value) {
        return fetchOne(AdministrativeUnit.ADMINISTRATIVE_UNIT.ADMINISTRATIVE_UNIT_ID, value);
    }

    /**
     * Fetch records that have <code>parent_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfParentId(UShort lowerInclusive, UShort upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.PARENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByParentId(UShort... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>full_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfFullName(String lowerInclusive, String upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.FULL_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>full_name IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByFullName(String... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.FULL_NAME, values);
    }

    /**
     * Fetch records that have <code>short_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfShortName(String lowerInclusive, String upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.SHORT_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>short_name IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByShortName(String... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.SHORT_NAME, values);
    }

    /**
     * Fetch records that have <code>alias BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfAlias(String lowerInclusive, String upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.ALIAS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>alias IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByAlias(String... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.ALIAS, values);
    }

    /**
     * Fetch records that have <code>level BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfLevel(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.LEVEL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByLevel(UByte... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.LEVEL, values);
    }

    /**
     * Fetch records that have <code>level_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfLevelName(String lowerInclusive, String upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.LEVEL_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>level_name IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByLevelName(String... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.LEVEL_NAME, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByCreateTime(LocalDateTime... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByCreateUserId(ULong... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByLastModifyUserId(ULong... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(AdministrativeUnit.ADMINISTRATIVE_UNIT.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.AdministrativeUnit> fetchByIsDeleted(ULong... values) {
        return fetch(AdministrativeUnit.ADMINISTRATIVE_UNIT.IS_DELETED, values);
    }
}
