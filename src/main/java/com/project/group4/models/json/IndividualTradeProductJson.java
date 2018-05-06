package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class IndividualTradeProductJson {

    @JsonProperty("batch_id")
    private String batchId;

    @JsonProperty("expiry_date_time")
    private String expiryDateTime;
}
