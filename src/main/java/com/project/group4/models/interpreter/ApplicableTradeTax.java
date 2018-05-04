package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApplicableTradeTax {

    private String typeCode;
    private String calculatedRate;
    private String basisAmount;
    private String calculatedAmount;

    public ApplicableTradeTax() {
    }

    public ApplicableTradeTax(String typeCode, String calculatedRate, String basisAmount, String calculatedAmount) {
        this.typeCode = typeCode;
        this.calculatedRate = calculatedRate;
        this.basisAmount = basisAmount;
        this.calculatedAmount = calculatedAmount;
    }
}
