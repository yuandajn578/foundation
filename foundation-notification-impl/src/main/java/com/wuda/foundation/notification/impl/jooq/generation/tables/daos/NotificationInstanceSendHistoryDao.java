/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.daos;


import com.wuda.foundation.notification.impl.jooq.generation.tables.NotificationInstanceSendHistory;
import com.wuda.foundation.notification.impl.jooq.generation.tables.records.NotificationInstanceSendHistoryRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 通知发送历史
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationInstanceSendHistoryDao extends DAOImpl<NotificationInstanceSendHistoryRecord, com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory, ULong> {

    /**
     * Create a new NotificationInstanceSendHistoryDao without any configuration
     */
    public NotificationInstanceSendHistoryDao() {
        super(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY, com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory.class);
    }

    /**
     * Create a new NotificationInstanceSendHistoryDao with an attached configuration
     */
    public NotificationInstanceSendHistoryDao(Configuration configuration) {
        super(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY, com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory object) {
        return object.getNotificationInstanceSendHistoryId();
    }

    /**
     * Fetch records that have <code>notification_instance_send_history_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfNotificationInstanceSendHistoryId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.NOTIFICATION_INSTANCE_SEND_HISTORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_instance_send_history_id IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchByNotificationInstanceSendHistoryId(ULong... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.NOTIFICATION_INSTANCE_SEND_HISTORY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>notification_instance_send_history_id = value</code>
     */
    public com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory fetchOneByNotificationInstanceSendHistoryId(ULong value) {
        return fetchOne(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.NOTIFICATION_INSTANCE_SEND_HISTORY_ID, value);
    }

    /**
     * Fetch records that have <code>notification_instance_content_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfNotificationInstanceContentId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.NOTIFICATION_INSTANCE_CONTENT_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>notification_instance_content_id IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchByNotificationInstanceContentId(ULong... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.NOTIFICATION_INSTANCE_CONTENT_ID, values);
    }

    /**
     * Fetch records that have <code>send_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfSendTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.SEND_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>send_time IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchBySendTime(LocalDateTime... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.SEND_TIME, values);
    }

    /**
     * Fetch records that have <code>sender_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfSenderType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.SENDER_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>sender_type IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchBySenderType(UByte... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.SENDER_TYPE, values);
    }

    /**
     * Fetch records that have <code>sender_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfSenderIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.SENDER_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>sender_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchBySenderIdentifier(ULong... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.SENDER_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>receiver_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfReceiverType(Byte lowerInclusive, Byte upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.RECEIVER_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>receiver_type IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchByReceiverType(Byte... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.RECEIVER_TYPE, values);
    }

    /**
     * Fetch records that have <code>receiver_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfReceiverIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.RECEIVER_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>receiver_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchByReceiverIdentifier(ULong... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.RECEIVER_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.notification.impl.jooq.generation.tables.pojos.NotificationInstanceSendHistory> fetchByIsDeleted(ULong... values) {
        return fetch(NotificationInstanceSendHistory.NOTIFICATION_INSTANCE_SEND_HISTORY.IS_DELETED, values);
    }
}
