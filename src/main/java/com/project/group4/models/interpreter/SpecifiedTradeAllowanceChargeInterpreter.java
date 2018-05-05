package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class SpecifiedTradeAllowanceChargeInterpreter {

    private String chargeIndicator;
    private String actualAmount;
    private String reasonCode;
    private String reason;
}
