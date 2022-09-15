package com.synechron.internship.activemq.model.Messages;

import com.synechron.internship.activemq.model.MessageData;
import com.synechron.internship.activemq.model.MessageType;

import java.util.List;

public class DriverMessageData extends MessageData {
    private Long driverId;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isDeleted = false;
    private List<RiskMessageData> risks;
    private List<AccidentHistoryMessageData> accidentHistories;

    public DriverMessageData() {
        super();
    }

    public DriverMessageData(Long driverId, String firstName, String lastName, String email,Boolean isDeleted, List<RiskMessageData> risks, List<AccidentHistoryMessageData> accidentHistories, MessageType messageType) {
        super(messageType);
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.risks = risks;
        this.accidentHistories = accidentHistories;
        this.isDeleted=isDeleted;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
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

    public List<RiskMessageData> getRisks() {
        return risks;
    }

    public void setRisks(List<RiskMessageData> risks) {
        this.risks = risks;
    }

    public List<AccidentHistoryMessageData> getAccidentHistories() {
        return accidentHistories;
    }

    public void setAccidentHistories(List<AccidentHistoryMessageData> accidentHistories) {
        this.accidentHistories = accidentHistories;
    }

}

