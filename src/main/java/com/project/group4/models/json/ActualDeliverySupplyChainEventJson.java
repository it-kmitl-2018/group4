package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class ActualDeliverySupplyChainEventJson {

    @JsonProperty("occurrence_date")
    public String occurrenceDate;
}
