package com.synechron.internship.activemq.model.Messages;

import com.synechron.internship.activemq.model.MessageData;
import com.synechron.internship.activemq.model.MessageType;

public class InsuranceItemMessageData extends MessageData {
    private Long insuranceItemId;
    private String name;
    private Integer amount;
    private Boolean isDeleted = false;

    public InsuranceItemMessageData() {
        super();
    }

    public InsuranceItemMessageData(Long insuranceItemId, String name, Integer amount,Boolean isDeleted, MessageType messageType) {
        super(messageType);
        this.insuranceItemId = insuranceItemId;
        this.name = name;
        this.amount = amount;
        this.isDeleted = isDeleted;
    }

    public Long getInsuranceItemId() {
        return insuranceItemId;
    }

    public void setInsuranceItemId(Long insuranceItemId) {
        this.insuranceItemId = insuranceItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
