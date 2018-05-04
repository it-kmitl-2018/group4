package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SpecifiedTradeSummation {

    private String originalInfoAmount;
    private String lineTotalAmount;
    private String differenceSalesInfoAmount;
    private String allowanceTotalAmount;
    private String chargeTotalAmount;
    private String taxBasisTotalAmount;
    private String taxTotalAmount;
    private String grandTotalAmount;

    public SpecifiedTradeSummation(String originalInfoAmount, String lineTotalAmount, String differenceSalesInfoAmount,
                                   String allowanceTotalAmount, String chargeTotalAmount, String taxBasisTotalAmount,
                                   String taxTotalAmount, String grandTotalAmount) {
        this.originalInfoAmount = originalInfoAmount;
        this.lineTotalAmount = lineTotalAmount;
        this.differenceSalesInfoAmount = differenceSalesInfoAmount;
        this.allowanceTotalAmount = allowanceTotalAmount;
        this.chargeTotalAmount = chargeTotalAmount;
        this.taxBasisTotalAmount = taxBasisTotalAmount;
        this.taxTotalAmount = taxTotalAmount;
        this.grandTotalAmount = grandTotalAmount;
    }

    public SpecifiedTradeSummation() {
    }
}
