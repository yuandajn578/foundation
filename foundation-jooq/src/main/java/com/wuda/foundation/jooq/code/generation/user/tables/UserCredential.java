/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.user.tables;


import com.wuda.foundation.jooq.code.generation.user.FoundationUser;
import com.wuda.foundation.jooq.code.generation.user.Indexes;
import com.wuda.foundation.jooq.code.generation.user.Keys;
import com.wuda.foundation.jooq.code.generation.user.tables.records.UserCredentialRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 比如password，public key等都是credential
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCredential extends TableImpl<UserCredentialRecord> {

    private static final long serialVersionUID = 2072753899;

    /**
     * The reference instance of <code>foundation_user.user_credential</code>
     */
    public static final UserCredential USER_CREDENTIAL = new UserCredential();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserCredentialRecord> getRecordType() {
        return UserCredentialRecord.class;
    }

    /**
     * The column <code>foundation_user.user_credential.user_credential_id</code>.
     */
    public final TableField<UserCredentialRecord, ULong> USER_CREDENTIAL_ID = createField(DSL.name("user_credential_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_user.user_credential.user_id</code>. 用户ID
     */
    public final TableField<UserCredentialRecord, ULong> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "用户ID");

    /**
     * The column <code>foundation_user.user_credential.type</code>. credential type，比如password、public key
     */
    public final TableField<UserCredentialRecord, UByte> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "credential type，比如password、public key");

    /**
     * The column <code>foundation_user.user_credential.value</code>.
     */
    public final TableField<UserCredentialRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_credential.description</code>.
     */
    public final TableField<UserCredentialRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(245).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>foundation_user.user_credential.create_time</code>.
     */
    public final TableField<UserCredentialRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_user.user_credential.create_user_id</code>.
     */
    public final TableField<UserCredentialRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_credential.last_modify_time</code>.
     */
    public final TableField<UserCredentialRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_user.user_credential.last_modify_user_id</code>.
     */
    public final TableField<UserCredentialRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_user.user_credential.is_deleted</code>.
     */
    public final TableField<UserCredentialRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_user.user_credential</code> table reference
     */
    public UserCredential() {
        this(DSL.name("user_credential"), null);
    }

    /**
     * Create an aliased <code>foundation_user.user_credential</code> table reference
     */
    public UserCredential(String alias) {
        this(DSL.name(alias), USER_CREDENTIAL);
    }

    /**
     * Create an aliased <code>foundation_user.user_credential</code> table reference
     */
    public UserCredential(Name alias) {
        this(alias, USER_CREDENTIAL);
    }

    private UserCredential(Name alias, Table<UserCredentialRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserCredential(Name alias, Table<UserCredentialRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("比如password，public key等都是credential"), TableOptions.table());
    }

    public <O extends Record> UserCredential(Table<O> child, ForeignKey<O, UserCredentialRecord> key) {
        super(child, key, USER_CREDENTIAL);
    }

    @Override
    public Schema getSchema() {
        return FoundationUser.FOUNDATION_USER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_CREDENTIAL_USER_ID_IDX);
    }

    @Override
    public Identity<UserCredentialRecord, ULong> getIdentity() {
        return Keys.IDENTITY_USER_CREDENTIAL;
    }

    @Override
    public UniqueKey<UserCredentialRecord> getPrimaryKey() {
        return Keys.KEY_USER_CREDENTIAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserCredentialRecord>> getKeys() {
        return Arrays.<UniqueKey<UserCredentialRecord>>asList(Keys.KEY_USER_CREDENTIAL_PRIMARY);
    }

    @Override
    public UserCredential as(String alias) {
        return new UserCredential(DSL.name(alias), this);
    }

    @Override
    public UserCredential as(Name alias) {
        return new UserCredential(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserCredential rename(String name) {
        return new UserCredential(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserCredential rename(Name name) {
        return new UserCredential(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, ULong, UByte, String, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}