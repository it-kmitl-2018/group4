package com.project.group4.models.json;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuyerTradePartyJsonTest {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistration;
    private TradeContact tradeContact;
    private Address address;

    @Test
    public void buildTest() {
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(this.name)
                .taxRegistration(this.taxRegistration)
                .tradeContact(this.tradeContact)
                .address(this.address)
                .build();

        assertEquals(this.id, buyerTradePartyJson.id);
        assertEquals(this.globalId, buyerTradePartyJson.globalId);
        assertEquals(this.name, buyerTradePartyJson.name);
        assertEquals(this.taxRegistration, buyerTradePartyJson.taxRegistration);
        assertEquals(this.tradeContact, buyerTradePartyJson.tradeContact);
        assertEquals(this.address, buyerTradePartyJson.address);
    }
}