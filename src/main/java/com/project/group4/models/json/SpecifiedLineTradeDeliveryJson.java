package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class SpecifiedLineTradeDeliveryJson {

    @JsonProperty("billed_quantity")
    private String billedQuantity;

    @JsonProperty("per_package_unit_quantity")
    private String perPackageUnitQuantity;
}
