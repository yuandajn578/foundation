/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 通知发送历史
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationInstanceSendHistory implements Serializable {

    private static final long serialVersionUID = 1379022787;

    private ULong         notificationInstanceSendHistoryId;
    private ULong         notificationInstanceContentId;
    private LocalDateTime sendTime;
    private UByte         senderType;
    private ULong         senderIdentifier;
    private Byte          receiverType;
    private ULong         receiverIdentifier;
    private ULong         isDeleted;

    public NotificationInstanceSendHistory() {}

    public NotificationInstanceSendHistory(NotificationInstanceSendHistory value) {
        this.notificationInstanceSendHistoryId = value.notificationInstanceSendHistoryId;
        this.notificationInstanceContentId = value.notificationInstanceContentId;
        this.sendTime = value.sendTime;
        this.senderType = value.senderType;
        this.senderIdentifier = value.senderIdentifier;
        this.receiverType = value.receiverType;
        this.receiverIdentifier = value.receiverIdentifier;
        this.isDeleted = value.isDeleted;
    }

    public NotificationInstanceSendHistory(
        ULong         notificationInstanceSendHistoryId,
        ULong         notificationInstanceContentId,
        LocalDateTime sendTime,
        UByte         senderType,
        ULong         senderIdentifier,
        Byte          receiverType,
        ULong         receiverIdentifier,
        ULong         isDeleted
    ) {
        this.notificationInstanceSendHistoryId = notificationInstanceSendHistoryId;
        this.notificationInstanceContentId = notificationInstanceContentId;
        this.sendTime = sendTime;
        this.senderType = senderType;
        this.senderIdentifier = senderIdentifier;
        this.receiverType = receiverType;
        this.receiverIdentifier = receiverIdentifier;
        this.isDeleted = isDeleted;
    }

    public ULong getNotificationInstanceSendHistoryId() {
        return this.notificationInstanceSendHistoryId;
    }

    public void setNotificationInstanceSendHistoryId(ULong notificationInstanceSendHistoryId) {
        this.notificationInstanceSendHistoryId = notificationInstanceSendHistoryId;
    }

    public ULong getNotificationInstanceContentId() {
        return this.notificationInstanceContentId;
    }

    public void setNotificationInstanceContentId(ULong notificationInstanceContentId) {
        this.notificationInstanceContentId = notificationInstanceContentId;
    }

    public LocalDateTime getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public UByte getSenderType() {
        return this.senderType;
    }

    public void setSenderType(UByte senderType) {
        this.senderType = senderType;
    }

    public ULong getSenderIdentifier() {
        return this.senderIdentifier;
    }

    public void setSenderIdentifier(ULong senderIdentifier) {
        this.senderIdentifier = senderIdentifier;
    }

    public Byte getReceiverType() {
        return this.receiverType;
    }

    public void setReceiverType(Byte receiverType) {
        this.receiverType = receiverType;
    }

    public ULong getReceiverIdentifier() {
        return this.receiverIdentifier;
    }

    public void setReceiverIdentifier(ULong receiverIdentifier) {
        this.receiverIdentifier = receiverIdentifier;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NotificationInstanceSendHistory (");

        sb.append(notificationInstanceSendHistoryId);
        sb.append(", ").append(notificationInstanceContentId);
        sb.append(", ").append(sendTime);
        sb.append(", ").append(senderType);
        sb.append(", ").append(senderIdentifier);
        sb.append(", ").append(receiverType);
        sb.append(", ").append(receiverIdentifier);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
