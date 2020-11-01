/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables;


import com.wuda.foundation.commons.impl.jooq.generation.FoundationCommons;
import com.wuda.foundation.commons.impl.jooq.generation.Keys;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.TaskLogRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 任务的日志
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskLog extends TableImpl<TaskLogRecord> {

    private static final long serialVersionUID = -878800444;

    /**
     * The reference instance of <code>foundation_commons.task_log</code>
     */
    public static final TaskLog TASK_LOG = new TaskLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskLogRecord> getRecordType() {
        return TaskLogRecord.class;
    }

    /**
     * The column <code>foundation_commons.task_log.task_log_id</code>.
     */
    public final TableField<TaskLogRecord, ULong> TASK_LOG_ID = createField(DSL.name("task_log_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.task_log.task_id</code>. 所属的任务
     */
    public final TableField<TaskLogRecord, ULong> TASK_ID = createField(DSL.name("task_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "所属的任务");

    /**
     * The column <code>foundation_commons.task_log.task_phase_id</code>. 所属任务的阶段，如果为0，表示日志只属于主体的task，不属于任何phase
     */
    public final TableField<TaskLogRecord, ULong> TASK_PHASE_ID = createField(DSL.name("task_phase_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "所属任务的阶段，如果为0，表示日志只属于主体的task，不属于任何phase");

    /**
     * The column <code>foundation_commons.task_log.content</code>.
     */
    public final TableField<TaskLogRecord, String> CONTENT = createField(DSL.name("content"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>foundation_commons.task_log.create_time</code>.
     */
    public final TableField<TaskLogRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.task_log.create_user_id</code>.
     */
    public final TableField<TaskLogRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.task_log.last_modify_time</code>.
     */
    public final TableField<TaskLogRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.task_log.last_modify_user_id</code>.
     */
    public final TableField<TaskLogRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.task_log.is_deleted</code>.
     */
    public final TableField<TaskLogRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.task_log</code> table reference
     */
    public TaskLog() {
        this(DSL.name("task_log"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.task_log</code> table reference
     */
    public TaskLog(String alias) {
        this(DSL.name(alias), TASK_LOG);
    }

    /**
     * Create an aliased <code>foundation_commons.task_log</code> table reference
     */
    public TaskLog(Name alias) {
        this(alias, TASK_LOG);
    }

    private TaskLog(Name alias, Table<TaskLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskLog(Name alias, Table<TaskLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("任务的日志"), TableOptions.table());
    }

    public <O extends Record> TaskLog(Table<O> child, ForeignKey<O, TaskLogRecord> key) {
        super(child, key, TASK_LOG);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public Identity<TaskLogRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TASK_LOG;
    }

    @Override
    public UniqueKey<TaskLogRecord> getPrimaryKey() {
        return Keys.KEY_TASK_LOG_PRIMARY;
    }

    @Override
    public List<UniqueKey<TaskLogRecord>> getKeys() {
        return Arrays.<UniqueKey<TaskLogRecord>>asList(Keys.KEY_TASK_LOG_PRIMARY);
    }

    @Override
    public TaskLog as(String alias) {
        return new TaskLog(DSL.name(alias), this);
    }

    @Override
    public TaskLog as(Name alias) {
        return new TaskLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskLog rename(String name) {
        return new TaskLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskLog rename(Name name) {
        return new TaskLog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
