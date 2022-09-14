package com.synecrhon.internship.activemq.model.messages;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AccidentHistoryMessageData implements Serializable {
    private Long accidentId;
    private LocalDateTime happened;
    private Boolean wasResponsible = false;
    private String description;

    public AccidentHistoryMessageData() {
    }

    public AccidentHistoryMessageData(Long accidentId, LocalDateTime happened, Boolean wasResponsible, String description) {
        this.accidentId = accidentId;
        this.happened = happened;
        this.wasResponsible = wasResponsible;
        this.description = description;
    }

    public Long getAccidentId() {
        return accidentId;
    }

    public void setAccidentId(Long accidentId) {
        this.accidentId = accidentId;
    }

    public LocalDateTime getHappened() {
        return happened;
    }

    public void setHappened(LocalDateTime happened) {
        this.happened = happened;
    }

    public Boolean getWasResponsible() {
        return wasResponsible;
    }

    public void setWasResponsible(Boolean wasResponsible) {
        this.wasResponsible = wasResponsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
