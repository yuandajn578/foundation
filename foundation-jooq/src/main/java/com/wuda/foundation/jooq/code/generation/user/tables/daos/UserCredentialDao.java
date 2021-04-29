/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.user.tables.daos;


import com.wuda.foundation.jooq.code.generation.user.tables.UserCredential;
import com.wuda.foundation.jooq.code.generation.user.tables.records.UserCredentialRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 比如password，public key等都是credential
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCredentialDao extends DAOImpl<UserCredentialRecord, com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential, ULong> {

    /**
     * Create a new UserCredentialDao without any configuration
     */
    public UserCredentialDao() {
        super(UserCredential.USER_CREDENTIAL, com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential.class);
    }

    /**
     * Create a new UserCredentialDao with an attached configuration
     */
    public UserCredentialDao(Configuration configuration) {
        super(UserCredential.USER_CREDENTIAL, com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential object) {
        return object.getUserCredentialId();
    }

    /**
     * Fetch records that have <code>user_credential_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfUserCredentialId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.USER_CREDENTIAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_credential_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByUserCredentialId(ULong... values) {
        return fetch(UserCredential.USER_CREDENTIAL.USER_CREDENTIAL_ID, values);
    }

    /**
     * Fetch a unique record that has <code>user_credential_id = value</code>
     */
    public com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential fetchOneByUserCredentialId(ULong value) {
        return fetchOne(UserCredential.USER_CREDENTIAL.USER_CREDENTIAL_ID, value);
    }

    /**
     * Fetch records that have <code>user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByUserId(ULong... values) {
        return fetch(UserCredential.USER_CREDENTIAL.USER_ID, values);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByType(UByte... values) {
        return fetch(UserCredential.USER_CREDENTIAL.TYPE, values);
    }

    /**
     * Fetch records that have <code>value BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfValue(String lowerInclusive, String upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.VALUE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByValue(String... values) {
        return fetch(UserCredential.USER_CREDENTIAL.VALUE, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByDescription(String... values) {
        return fetch(UserCredential.USER_CREDENTIAL.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByCreateTime(LocalDateTime... values) {
        return fetch(UserCredential.USER_CREDENTIAL.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByCreateUserId(ULong... values) {
        return fetch(UserCredential.USER_CREDENTIAL.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(UserCredential.USER_CREDENTIAL.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByLastModifyUserId(ULong... values) {
        return fetch(UserCredential.USER_CREDENTIAL.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(UserCredential.USER_CREDENTIAL.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.jooq.code.generation.user.tables.pojos.UserCredential> fetchByIsDeleted(ULong... values) {
        return fetch(UserCredential.USER_CREDENTIAL.IS_DELETED, values);
    }
}