package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class SpecifiedTradeSummationInterpreter {

    private String originalInfoAmount;
    private String lineTotalAmount;
    private String differenceSalesInfoAmount;
    private String allowanceTotalAmount;
    private String chargeTotalAmount;
    private String taxBasisTotalAmount;
    private String taxTotalAmount;
    private String grandTotalAmount;
}
