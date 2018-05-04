package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SpecifiedTradeAllowanceCharge {

    private String chargeIndicator;
    private String actualAmount;
    private String reasonCode;
    private String reason;

    public SpecifiedTradeAllowanceCharge() {
    }

    public SpecifiedTradeAllowanceCharge(String chargeIndicator, String actualAmount, String reasonCode, String reason) {
        this.chargeIndicator = chargeIndicator;
        this.actualAmount = actualAmount;
        this.reasonCode = reasonCode;
        this.reason = reason;
    }
}
