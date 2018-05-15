package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import lombok.Builder;

@Builder
public class BuyerTradePartyJson {

    @JsonProperty("tax_number")
    public String taxNumber;

    @JsonProperty("branch_number")
    public String branchNumber;

    @JsonProperty("name_en")
    public String nameEn;

    @JsonProperty("name_th")
    public String nameTh;

    @JsonProperty("email")
    public String email;

    @JsonProperty("fax")
    public String fax;

    @JsonProperty("address")
    public Address address;
}
