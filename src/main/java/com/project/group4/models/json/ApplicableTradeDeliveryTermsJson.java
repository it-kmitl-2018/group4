package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class ApplicableTradeDeliveryTermsJson {

    @JsonProperty("deliveryTypeCode")
    public String deliveryTypeCode;
}
