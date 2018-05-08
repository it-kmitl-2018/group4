package com.project.group4.models.interpreter;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class BuyerTradePartyInterpreter {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistration;
    private TradeContact tradeContact;
    private Address address;
}