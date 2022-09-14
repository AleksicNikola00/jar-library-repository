package com.synecrhon.internship.activemq.model.messages;

;
import com.synecrhon.internship.activemq.model.ResponseType;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ResponseMessageData implements Serializable {
    private LocalDateTime time;
    private String message;
    private ResponseType responseType;

    public ResponseMessageData() {
    }

    public ResponseMessageData(LocalDateTime time, String message, ResponseType responseType) {
        this.time = time;
        this.message = message;
        this.responseType = responseType;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }
}
