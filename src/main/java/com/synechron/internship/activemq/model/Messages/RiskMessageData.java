package com.synechron.internship.activemq.model.Messages;

import com.synechron.internship.activemq.model.MessageData;
import com.synechron.internship.activemq.model.MessageType;

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
