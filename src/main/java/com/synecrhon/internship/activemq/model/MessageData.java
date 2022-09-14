package com.synecrhon.internship.activemq.model;

import java.io.Serializable;

public class MessageData implements Serializable {
    private MessageType messageType;

    public MessageData() {
    }

    public MessageData(MessageType messageType) {
        this.messageType = messageType;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
