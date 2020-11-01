/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables;


import com.wuda.foundation.notification.impl.jooq.generation.FoundationNotification;
import com.wuda.foundation.notification.impl.jooq.generation.Indexes;
import com.wuda.foundation.notification.impl.jooq.generation.Keys;
import com.wuda.foundation.notification.impl.jooq.generation.tables.records.NotificationDefinitionObserverrExpandSnapshotRecord;

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
 * 接收者如果是“全部”，“莫某部门”这样的一类用户时，在接收者主表保存“全部”这样类型的接收者时，将当时那个瞬间“全部”的用户展开来保存到这个表中，比如当时整个公司全部只有20个人，则在这个表展开来就有20条记录，后面如果公司再新进新人，则新人不包含。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDefinitionObserverrExpandSnapshot extends TableImpl<NotificationDefinitionObserverrExpandSnapshotRecord> {

    private static final long serialVersionUID = -1855106428;

    /**
     * The reference instance of <code>foundation_notification.notification_definition_observerr_expand_snapshot</code>
     */
    public static final NotificationDefinitionObserverrExpandSnapshot NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT = new NotificationDefinitionObserverrExpandSnapshot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NotificationDefinitionObserverrExpandSnapshotRecord> getRecordType() {
        return NotificationDefinitionObserverrExpandSnapshotRecord.class;
    }

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.notification_definition_observer_expand_snapshot_id</code>. 表的主键
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> NOTIFICATION_DEFINITION_OBSERVER_EXPAND_SNAPSHOT_ID = createField(DSL.name("notification_definition_observer_expand_snapshot_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "表的主键");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.notification_definition_id</code>.
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> NOTIFICATION_DEFINITION_ID = createField(DSL.name("notification_definition_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.notification_definition_receiver_id</code>. 接收者主表，被展开的记录的ID。
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> NOTIFICATION_DEFINITION_RECEIVER_ID = createField(DSL.name("notification_definition_receiver_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "接收者主表，被展开的记录的ID。");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.observer_type</code>. 接收者类型，不能再展开的接收者的类型，比如公司，部门，组等这样的接收者是可以最终展开成用户的；但是用户无法再展开，用户是最终的接收者。但是由于接收者还可以是服务等其他主体，因此这里不代表一定是最终用户，因此还是需要有类型进行区分。
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, UByte> OBSERVER_TYPE = createField(DSL.name("observer_type"), org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "接收者类型，不能再展开的接收者的类型，比如公司，部门，组等这样的接收者是可以最终展开成用户的；但是用户无法再展开，用户是最终的接收者。但是由于接收者还可以是服务等其他主体，因此这里不代表一定是最终用户，因此还是需要有类型进行区分。");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.observer_identifier</code>. 接收者唯一标记
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> OBSERVER_IDENTIFIER = createField(DSL.name("observer_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "接收者唯一标记");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.create_time</code>.
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.create_user_id</code>.
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.last_modify_time</code>.
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.last_modify_user_id</code>.
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_notification.notification_definition_observerr_expand_snapshot.is_deleted</code>.
     */
    public final TableField<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_notification.notification_definition_observerr_expand_snapshot</code> table reference
     */
    public NotificationDefinitionObserverrExpandSnapshot() {
        this(DSL.name("notification_definition_observerr_expand_snapshot"), null);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_definition_observerr_expand_snapshot</code> table reference
     */
    public NotificationDefinitionObserverrExpandSnapshot(String alias) {
        this(DSL.name(alias), NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT);
    }

    /**
     * Create an aliased <code>foundation_notification.notification_definition_observerr_expand_snapshot</code> table reference
     */
    public NotificationDefinitionObserverrExpandSnapshot(Name alias) {
        this(alias, NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT);
    }

    private NotificationDefinitionObserverrExpandSnapshot(Name alias, Table<NotificationDefinitionObserverrExpandSnapshotRecord> aliased) {
        this(alias, aliased, null);
    }

    private NotificationDefinitionObserverrExpandSnapshot(Name alias, Table<NotificationDefinitionObserverrExpandSnapshotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("接收者如果是“全部”，“莫某部门”这样的一类用户时，在接收者主表保存“全部”这样类型的接收者时，将当时那个瞬间“全部”的用户展开来保存到这个表中，比如当时整个公司全部只有20个人，则在这个表展开来就有20条记录，后面如果公司再新进新人，则新人不包含。"), TableOptions.table());
    }

    public <O extends Record> NotificationDefinitionObserverrExpandSnapshot(Table<O> child, ForeignKey<O, NotificationDefinitionObserverrExpandSnapshotRecord> key) {
        super(child, key, NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT);
    }

    @Override
    public Schema getSchema() {
        return FoundationNotification.FOUNDATION_NOTIFICATION;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT_IDX_NOTIFICATION_DEFINITION_ID, Indexes.NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT_IDX_NOTIFICATION_DEFINITION_RECEIVER_ID);
    }

    @Override
    public Identity<NotificationDefinitionObserverrExpandSnapshotRecord, ULong> getIdentity() {
        return Keys.IDENTITY_NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT;
    }

    @Override
    public UniqueKey<NotificationDefinitionObserverrExpandSnapshotRecord> getPrimaryKey() {
        return Keys.KEY_NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT_PRIMARY;
    }

    @Override
    public List<UniqueKey<NotificationDefinitionObserverrExpandSnapshotRecord>> getKeys() {
        return Arrays.<UniqueKey<NotificationDefinitionObserverrExpandSnapshotRecord>>asList(Keys.KEY_NOTIFICATION_DEFINITION_OBSERVERR_EXPAND_SNAPSHOT_PRIMARY);
    }

    @Override
    public NotificationDefinitionObserverrExpandSnapshot as(String alias) {
        return new NotificationDefinitionObserverrExpandSnapshot(DSL.name(alias), this);
    }

    @Override
    public NotificationDefinitionObserverrExpandSnapshot as(Name alias) {
        return new NotificationDefinitionObserverrExpandSnapshot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDefinitionObserverrExpandSnapshot rename(String name) {
        return new NotificationDefinitionObserverrExpandSnapshot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NotificationDefinitionObserverrExpandSnapshot rename(Name name) {
        return new NotificationDefinitionObserverrExpandSnapshot(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<ULong, ULong, ULong, UByte, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
