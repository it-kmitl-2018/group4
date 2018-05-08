package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class SpecifiedTradeSummationInterpreter {

    private Double originalInfoAmount;
    private Double lineTotalAmount;
    private Double differenceSalesInfoAmount;
    private Double allowanceTotalAmount;
    private Double chargeTotalAmount;
    private Double taxBasisTotalAmount;
    private Double taxTotalAmount;
    private Double grandTotalAmount;
}
