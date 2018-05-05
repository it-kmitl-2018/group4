package com.project.group4.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class ApplicableTradeDeliveryTermsInterpreter {

    private String deliveryTypeCode;
}
