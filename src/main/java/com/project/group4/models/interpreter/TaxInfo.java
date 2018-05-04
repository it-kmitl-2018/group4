package com.project.group4.models.interpreter;

import lombok.Builder;

@Builder
public class TaxInfo { //Applicable Trade Tax

    private String typeCode;
    private String calculatedRate;
    private String basisAmount;
    private String calculatedAmount;

    public TaxInfo() {
    }

    public TaxInfo(String typeCode, String calculatedRate, String basisAmount, String calculatedAmount) {
        this.typeCode = typeCode;
        this.calculatedRate = calculatedRate;
        this.basisAmount = basisAmount;
        this.calculatedAmount = calculatedAmount;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getCalculatedRate() {
        return calculatedRate;
    }

    public void setCalculatedRate(String calculatedRate) {
        this.calculatedRate = calculatedRate;
    }

    public String getBasisAmount() {
        return basisAmount;
    }

    public void setBasisAmount(String basisAmount) {
        this.basisAmount = basisAmount;
    }

    public String getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(String calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }
}
