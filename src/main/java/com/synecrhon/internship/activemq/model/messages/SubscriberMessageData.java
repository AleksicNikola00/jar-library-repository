package com.synecrhon.internship.activemq.model.messages;

import com.synecrhon.internship.activemq.model.MessageData;
import com.synecrhon.internship.activemq.model.MessageType;

public class SubscriberMessageData extends MessageData {
    private Long subscriberId;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isDeleted = false;

    public SubscriberMessageData() {
        super();
    }

    public SubscriberMessageData(Long subscriberId, String firstName, String lastName, String email, Boolean isDeleted, MessageType messageType) {
        super(messageType);
        this.subscriberId = subscriberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isDeleted = isDeleted;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
