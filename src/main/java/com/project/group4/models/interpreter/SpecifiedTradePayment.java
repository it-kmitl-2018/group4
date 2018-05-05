package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SpecifiedTradePayment {

    private String typeCode;
    private String description;
    private String dueDateTime;

    public SpecifiedTradePayment(String typeCode, String description, String dueDateTime) {
        this.typeCode = typeCode;
        this.description = description;
        this.dueDateTime = dueDateTime;
    }

    public SpecifiedTradePayment() {
    }
