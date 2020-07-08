/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.store.impl.jooq.generation.tables;


import com.wuda.foundation.store.impl.jooq.generation.Indexes;
import com.wuda.foundation.store.impl.jooq.generation.Keys;
import com.wuda.foundation.store.impl.jooq.generation.Store;
import com.wuda.foundation.store.impl.jooq.generation.tables.records.StoreUserRelationshipRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 如果把用户ID字段放在store表中，表明店铺属于某个用户，但是如果有多个用户可以管理这个店铺呢？有种做法是一个用户作为另一个用户的子账号；也可以建立用户与店铺的关联关系，这样感觉更符合逻辑。把用户IID放在store表，可以很明确的表明店铺的owner，如果是用关联关系表的话，就需要明确的标明哪个用户是owner，哪些用户只是管理这个店铺的。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreUserRelationship extends TableImpl<StoreUserRelationshipRecord> {

    private static final long serialVersionUID = 1604861030;

    /**
     * The reference instance of <code>store.store_user_relationship</code>
     */
    public static final StoreUserRelationship STORE_USER_RELATIONSHIP = new StoreUserRelationship();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreUserRelationshipRecord> getRecordType() {
        return StoreUserRelationshipRecord.class;
    }

    /**
     * The column <code>store.store_user_relationship.id</code>.
     */
    public final TableField<StoreUserRelationshipRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>store.store_user_relationship.store_id</code>. store id
     */
    public final TableField<StoreUserRelationshipRecord, ULong> STORE_ID = createField(DSL.name("store_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "store id");

    /**
     * The column <code>store.store_user_relationship.user_id</code>. user id
     */
    public final TableField<StoreUserRelationshipRecord, ULong> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "user id");

    /**
     * The column <code>store.store_user_relationship.is_store_owner</code>. 该用户是否店铺的owner。一个店铺只能有一个owner，就好像在store表中放入user id字段，表明一对一的关系一样。
     */
    public final TableField<StoreUserRelationshipRecord, Boolean> IS_STORE_OWNER = createField(DSL.name("is_store_owner"), org.jooq.impl.SQLDataType.BIT.nullable(false), this, "该用户是否店铺的owner。一个店铺只能有一个owner，就好像在store表中放入user id字段，表明一对一的关系一样。");

    /**
     * The column <code>store.store_user_relationship.create_time</code>.
     */
    public final TableField<StoreUserRelationshipRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>store.store_user_relationship.create_user_id</code>.
     */
    public final TableField<StoreUserRelationshipRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>store.store_user_relationship.is_deleted</code>.
     */
    public final TableField<StoreUserRelationshipRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>store.store_user_relationship</code> table reference
     */
    public StoreUserRelationship() {
        this(DSL.name("store_user_relationship"), null);
    }

    /**
     * Create an aliased <code>store.store_user_relationship</code> table reference
     */
    public StoreUserRelationship(String alias) {
        this(DSL.name(alias), STORE_USER_RELATIONSHIP);
    }

    /**
     * Create an aliased <code>store.store_user_relationship</code> table reference
     */
    public StoreUserRelationship(Name alias) {
        this(alias, STORE_USER_RELATIONSHIP);
    }

    private StoreUserRelationship(Name alias, Table<StoreUserRelationshipRecord> aliased) {
        this(alias, aliased, null);
    }

    private StoreUserRelationship(Name alias, Table<StoreUserRelationshipRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("如果把用户ID字段放在store表中，表明店铺属于某个用户，但是如果有多个用户可以管理这个店铺呢？有种做法是一个用户作为另一个用户的子账号；也可以建立用户与店铺的关联关系，这样感觉更符合逻辑。把用户IID放在store表，可以很明确的表明店铺的owner，如果是用关联关系表的话，就需要明确的标明哪个用户是owner，哪些用户只是管理这个店铺的。"), TableOptions.table());
    }

    public <O extends Record> StoreUserRelationship(Table<O> child, ForeignKey<O, StoreUserRelationshipRecord> key) {
        super(child, key, STORE_USER_RELATIONSHIP);
    }

    @Override
    public Schema getSchema() {
        return Store.STORE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STORE_USER_RELATIONSHIP_FK_STORE_ID, Indexes.STORE_USER_RELATIONSHIP_FK_USER_ID);
    }

    @Override
    public Identity<StoreUserRelationshipRecord, ULong> getIdentity() {
        return Keys.IDENTITY_STORE_USER_RELATIONSHIP;
    }

    @Override
    public UniqueKey<StoreUserRelationshipRecord> getPrimaryKey() {
        return Keys.KEY_STORE_USER_RELATIONSHIP_PRIMARY;
    }

    @Override
    public List<UniqueKey<StoreUserRelationshipRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreUserRelationshipRecord>>asList(Keys.KEY_STORE_USER_RELATIONSHIP_PRIMARY);
    }

    @Override
    public StoreUserRelationship as(String alias) {
        return new StoreUserRelationship(DSL.name(alias), this);
    }

    @Override
    public StoreUserRelationship as(Name alias) {
        return new StoreUserRelationship(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreUserRelationship rename(String name) {
        return new StoreUserRelationship(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StoreUserRelationship rename(Name name) {
        return new StoreUserRelationship(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<ULong, ULong, ULong, Boolean, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
