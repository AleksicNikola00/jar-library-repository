package com.synecrhon.internship.activemq.model.messages;


import com.synecrhon.internship.activemq.model.MessageData;
import com.synecrhon.internship.activemq.model.MessageType;

public class RiskMessageData extends MessageData {
    private Long riskId;
    private String description;

    public RiskMessageData() {
    }

    public RiskMessageData(Long riskId, String description, MessageType messageType) {
        super(messageType);
        this.riskId = riskId;
        this.description = description;
    }

    public Long getRiskId() {
        return riskId;
    }

    public void setRiskId(Long riskId) {
        this.riskId = riskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
