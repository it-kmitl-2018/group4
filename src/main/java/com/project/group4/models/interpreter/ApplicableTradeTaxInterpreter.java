package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class ApplicableTradeTaxInterpreter {

    private String typeCode;
    private String calculatedRate;
    private String basisAmount;
    private String calculatedAmount;
}
