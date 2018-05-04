package com.project.group4.models.interpreter;

import lombok.Builder;

@Builder
public class FeeInfo { //Specified Trade Allowance Charge

    private String chargeIndicator;
    private String actualAmount;
    private String reasonCode;
    private String reason;

    public FeeInfo() {
    }

    public FeeInfo(String chargeIndicator, String actualAmount, String reasonCode, String reason) {
        this.chargeIndicator = chargeIndicator;
        this.actualAmount = actualAmount;
        this.reasonCode = reasonCode;
        this.reason = reason;
    }

    public String getChargeIndicator() {
        return chargeIndicator;
    }

    public void setChargeIndicator(String chargeIndicator) {
        this.chargeIndicator = chargeIndicator;
    }

    public String getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
