package com.synecrhon.internship.activemq.model.messages;


import com.synecrhon.internship.activemq.model.MessageData;
import com.synecrhon.internship.activemq.model.MessageType;

import java.util.List;

public class ProposalMessageData extends MessageData {
    private Long proposalId;
    private Double amount;
    private String licenceNum;
    private Long subscriberId;
    private Long carId;
    private List<FranchiseMessageData> franchisesMessageData;
    private List<Long> driverIds;
    private Boolean isDeleted = false;


    public ProposalMessageData() {
    }

    public ProposalMessageData(MessageType messageType, Long proposalId, Double amount, String licenceNum, Long subscriberId, Long carId, List<FranchiseMessageData> franchisesMessageData, List<Long> driverIds, Boolean isDeleted) {
        super(messageType);
        this.proposalId = proposalId;
        this.amount = amount;
        this.licenceNum = licenceNum;
        this.subscriberId = subscriberId;
        this.carId = carId;
        this.franchisesMessageData = franchisesMessageData;
        this.driverIds = driverIds;
        this.isDeleted = isDeleted;
    }

    public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public void setLicenceNum(String licenceNum) {
        this.licenceNum = licenceNum;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public List<FranchiseMessageData> getFranchisesMessageData() {
        return franchisesMessageData;
    }

    public void setFranchisesMessageData(List<FranchiseMessageData> franchisesMessageData) {
        this.franchisesMessageData = franchisesMessageData;
    }

    public List<Long> getDriverIds() {
        return driverIds;
    }

    public void setDriverIds(List<Long> driverIds) {
        this.driverIds = driverIds;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
