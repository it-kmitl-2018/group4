package com.project.group4.models.interpreter;

import lombok.Builder;

@Builder
public class TradePaymentInfo { //Specified Trade Payment Terms

    private String typeCode;
    private String description;
    private String dueDateTime;

    public TradePaymentInfo() {
    }

    public TradePaymentInfo(String typeCode, String description, String dueDateTime) {
        this.typeCode = typeCode;
        this.description = description;
        this.dueDateTime = dueDateTime;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDateTime() {
        return dueDateTime;
    }

    public void setDueDateTime(String dueDateTime) {
        this.dueDateTime = dueDateTime;
    }
}
