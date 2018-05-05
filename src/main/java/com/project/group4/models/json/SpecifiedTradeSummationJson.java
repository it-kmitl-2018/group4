package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class SpecifiedTradeSummationJson {

    @JsonProperty("tax_total_amount")
    public String taxTotalAmount;

    @JsonProperty("net_line_total_amount")
    public String pretaxTotalAmount;

    @JsonProperty("net_including_taxes_line_total_amount")
    public String totalAmount;
}
