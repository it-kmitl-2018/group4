package com.project.group4.models.interpreter;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import lombok.Builder;
import lombok.Data;

public @Data class BuyerTradeParty {

    private String id;
    private String globalId;
    private String name;
    private String taxId; //TaxRegistration
    private TradeContact tradeContact;
    private Address address;
}