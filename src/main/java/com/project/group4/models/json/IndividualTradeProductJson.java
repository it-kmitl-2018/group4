package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class IndividualTradeProductJson {

    @JsonProperty("batch_id")
    public String batchId;

    @JsonProperty("expiry_date_time")
    public String expiryDateTime;
}
