package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import lombok.Builder;

@Builder
public class BuyerTradePartyJson {

    @JsonProperty("id")
    public String id;

    @JsonProperty("globalId")
    public String globalId;

    @JsonProperty("name")
    public String name;

    @JsonProperty("taxRegistration")
    public String taxRegistration;

    @JsonProperty("tradeContact")
    public TradeContact tradeContact;

    @JsonProperty("address")
    public Address address;
}
