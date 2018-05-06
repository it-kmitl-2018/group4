package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class SpecifiedTradePaymentInterpreter {

    private String typeCode;
    private String description;
    private String dueDateTime;
}
