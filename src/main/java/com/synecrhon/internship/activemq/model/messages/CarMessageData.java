package com.synecrhon.internship.activemq.model.messages;

import com.synecrhon.internship.activemq.model.MessageData;
import com.synecrhon.internship.activemq.model.MessageType;


public class CarMessageData extends MessageData {
    private Long carId;
    private String modelName;
    private String brandName;
    private Integer year;

    private Boolean isDeleted = false;

    public CarMessageData() {
        super();
    }

    public CarMessageData(Long carId, String modelName, String brandName, Integer year,Boolean isDeleted, MessageType messageType) {
        super(messageType);
        this.carId = carId;
        this.modelName = modelName;
        this.brandName = brandName;
        this.year = year;
        this.isDeleted = isDeleted;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
