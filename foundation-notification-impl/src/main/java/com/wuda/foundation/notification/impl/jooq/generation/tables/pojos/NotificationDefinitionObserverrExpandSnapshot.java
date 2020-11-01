/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 接收者如果是“全部”，“莫某部门”这样的一类用户时，在接收者主表保存“全部”这样类型的接收者时，将当时那个瞬间“全部”的用户展开来保存到这个表中，比如当时整个公司全部只有20个人，则在这个表展开来就有20条记录，后面如果公司再新进新人，则新人不包含。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDefinitionObserverrExpandSnapshot implements Serializable {

    private static final long serialVersionUID = -34476505;

    private ULong         notificationDefinitionObserverExpandSnapshotId;
    private ULong         notificationDefinitionId;
    private ULong         notificationDefinitionReceiverId;
    private UByte         observerType;
    private ULong         observerIdentifier;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public NotificationDefinitionObserverrExpandSnapshot() {}

    public NotificationDefinitionObserverrExpandSnapshot(NotificationDefinitionObserverrExpandSnapshot value) {
        this.notificationDefinitionObserverExpandSnapshotId = value.notificationDefinitionObserverExpandSnapshotId;
        this.notificationDefinitionId = value.notificationDefinitionId;
        this.notificationDefinitionReceiverId = value.notificationDefinitionReceiverId;
        this.observerType = value.observerType;
        this.observerIdentifier = value.observerIdentifier;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public NotificationDefinitionObserverrExpandSnapshot(
        ULong         notificationDefinitionObserverExpandSnapshotId,
        ULong         notificationDefinitionId,
        ULong         notificationDefinitionReceiverId,
        UByte         observerType,
        ULong         observerIdentifier,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.notificationDefinitionObserverExpandSnapshotId = notificationDefinitionObserverExpandSnapshotId;
        this.notificationDefinitionId = notificationDefinitionId;
        this.notificationDefinitionReceiverId = notificationDefinitionReceiverId;
        this.observerType = observerType;
        this.observerIdentifier = observerIdentifier;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getNotificationDefinitionObserverExpandSnapshotId() {
        return this.notificationDefinitionObserverExpandSnapshotId;
    }

    public void setNotificationDefinitionObserverExpandSnapshotId(ULong notificationDefinitionObserverExpandSnapshotId) {
        this.notificationDefinitionObserverExpandSnapshotId = notificationDefinitionObserverExpandSnapshotId;
    }

    public ULong getNotificationDefinitionId() {
        return this.notificationDefinitionId;
    }

    public void setNotificationDefinitionId(ULong notificationDefinitionId) {
        this.notificationDefinitionId = notificationDefinitionId;
    }

    public ULong getNotificationDefinitionReceiverId() {
        return this.notificationDefinitionReceiverId;
    }

    public void setNotificationDefinitionReceiverId(ULong notificationDefinitionReceiverId) {
        this.notificationDefinitionReceiverId = notificationDefinitionReceiverId;
    }

    public UByte getObserverType() {
        return this.observerType;
    }

    public void setObserverType(UByte observerType) {
        this.observerType = observerType;
    }

    public ULong getObserverIdentifier() {
        return this.observerIdentifier;
    }

    public void setObserverIdentifier(ULong observerIdentifier) {
        this.observerIdentifier = observerIdentifier;
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
        StringBuilder sb = new StringBuilder("NotificationDefinitionObserverrExpandSnapshot (");

        sb.append(notificationDefinitionObserverExpandSnapshotId);
        sb.append(", ").append(notificationDefinitionId);
        sb.append(", ").append(notificationDefinitionReceiverId);
        sb.append(", ").append(observerType);
        sb.append(", ").append(observerIdentifier);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
