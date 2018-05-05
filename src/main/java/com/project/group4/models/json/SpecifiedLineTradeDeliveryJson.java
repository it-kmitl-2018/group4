package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class SpecifiedLineTradeDeliveryJson {

    @JsonProperty("billed_quantity")
    public String billedQuantity;

    @JsonProperty("per_package_unit_quantity")
    public String perPackageUnitQuantity;
}
