/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * 定义通知的内容。【一个很重要的规则是】同一个定义，可以反复发送通知（比如，你是一个系统管理员，当主机cpu超过50%的时候，就发送通知给你，这个时候，你可以声明一个通知定义，然后只要主机cpu超过50，就通过这个定义发送消息给你，这种场景下，通知定义是一次性的，但是通过这个定义，会发送无数条通知），因此，每当使用这个定义发送通知时，就可以为这个定义声明发送的内容。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationDefinitionContent implements Serializable {

    private static final long serialVersionUID = -220322224;

    private ULong         notificationDefinitionContentId;
    private ULong         notificationDefinitionfId;
    private ULong         notificationDefinitionSendMethodId;
    private String        title;
    private String        templateParameter;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public NotificationDefinitionContent() {}

    public NotificationDefinitionContent(NotificationDefinitionContent value) {
        this.notificationDefinitionContentId = value.notificationDefinitionContentId;
        this.notificationDefinitionfId = value.notificationDefinitionfId;
        this.notificationDefinitionSendMethodId = value.notificationDefinitionSendMethodId;
        this.title = value.title;
        this.templateParameter = value.templateParameter;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public NotificationDefinitionContent(
        ULong         notificationDefinitionContentId,
        ULong         notificationDefinitionfId,
        ULong         notificationDefinitionSendMethodId,
        String        title,
        String        templateParameter,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.notificationDefinitionContentId = notificationDefinitionContentId;
        this.notificationDefinitionfId = notificationDefinitionfId;
        this.notificationDefinitionSendMethodId = notificationDefinitionSendMethodId;
        this.title = title;
        this.templateParameter = templateParameter;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getNotificationDefinitionContentId() {
        return this.notificationDefinitionContentId;
    }

    public void setNotificationDefinitionContentId(ULong notificationDefinitionContentId) {
        this.notificationDefinitionContentId = notificationDefinitionContentId;
    }

    public ULong getNotificationDefinitionfId() {
        return this.notificationDefinitionfId;
    }

    public void setNotificationDefinitionfId(ULong notificationDefinitionfId) {
        this.notificationDefinitionfId = notificationDefinitionfId;
    }

    public ULong getNotificationDefinitionSendMethodId() {
        return this.notificationDefinitionSendMethodId;
    }

    public void setNotificationDefinitionSendMethodId(ULong notificationDefinitionSendMethodId) {
        this.notificationDefinitionSendMethodId = notificationDefinitionSendMethodId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTemplateParameter() {
        return this.templateParameter;
    }

    public void setTemplateParameter(String templateParameter) {
        this.templateParameter = templateParameter;
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
        StringBuilder sb = new StringBuilder("NotificationDefinitionContent (");

        sb.append(notificationDefinitionContentId);
        sb.append(", ").append(notificationDefinitionfId);
        sb.append(", ").append(notificationDefinitionSendMethodId);
        sb.append(", ").append(title);
        sb.append(", ").append(templateParameter);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
