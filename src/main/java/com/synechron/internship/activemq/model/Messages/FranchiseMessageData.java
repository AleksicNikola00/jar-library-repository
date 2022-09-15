package com.synechron.internship.activemq.model.Messages;

import com.synechron.internship.activemq.model.MessageData;
import com.synechron.internship.activemq.model.MessageType;

public class FranchiseMessageData extends MessageData {
    private Long franchiseId;
    private int percentage;
    private Long insuranceItemId;

    public FranchiseMessageData() {
        super();
    }

    public FranchiseMessageData(Long franchiseId, int percentage, Long insuranceItemId, MessageType messageType) {
        super(messageType);
        this.franchiseId = franchiseId;
        this.percentage = percentage;
        this.insuranceItemId = insuranceItemId;
    }

    public Long getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Long franchiseId) {
        this.franchiseId = franchiseId;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }


    public Long getInsuranceItemId() {
        return insuranceItemId;
    }

    public void setInsuranceItemId(Long insuranceItemId) {
        this.insuranceItemId = insuranceItemId;
    }

}
