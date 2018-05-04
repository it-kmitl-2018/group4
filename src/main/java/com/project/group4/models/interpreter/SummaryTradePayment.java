package com.project.group4.models.interpreter;

import lombok.Builder;

@Builder
public class SummaryTradePayment { //Specified Trade SettlementHeader Monetary Summation

    private String originalInfoAmount;
    private String lineTotalAmount;
    private String differenceSalesInfoAmount;
    private String allowanceTotalAmount;
    private String chargeTotalAmount;
    private String taxBasisTotalAmount;
    private String taxTotalAmount;
    private String grandTotalAmount;

    public SummaryTradePayment(String originalInfoAmount, String lineTotalAmount, String differenceSalesInfoAmount,
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

    public SummaryTradePayment() {
    }

    public String getOriginalInfoAmount() {
        return originalInfoAmount;
    }

    public void setOriginalInfoAmount(String originalInfoAmount) {
        this.originalInfoAmount = originalInfoAmount;
    }

    public String getLineTotalAmount() {
        return lineTotalAmount;
    }

    public void setLineTotalAmount(String lineTotalAmount) {
        this.lineTotalAmount = lineTotalAmount;
    }

    public String getDifferenceSalesInfoAmount() {
        return differenceSalesInfoAmount;
    }

    public void setDifferenceSalesInfoAmount(String differenceSalesInfoAmount) {
        this.differenceSalesInfoAmount = differenceSalesInfoAmount;
    }

    public String getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    public void setAllowanceTotalAmount(String allowanceTotalAmount) {
        this.allowanceTotalAmount = allowanceTotalAmount;
    }

    public String getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    public void setChargeTotalAmount(String chargeTotalAmount) {
        this.chargeTotalAmount = chargeTotalAmount;
    }

    public String getTaxBasisTotalAmount() {
        return taxBasisTotalAmount;
    }

    public void setTaxBasisTotalAmount(String taxBasisTotalAmount) {
        this.taxBasisTotalAmount = taxBasisTotalAmount;
    }

    public String getTaxTotalAmount() {
        return taxTotalAmount;
    }

    public void setTaxTotalAmount(String taxTotalAmount) {
        this.taxTotalAmount = taxTotalAmount;
    }

    public String getGrandTotalAmount() {
        return grandTotalAmount;
    }

    public void setGrandTotalAmount(String grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }
}
