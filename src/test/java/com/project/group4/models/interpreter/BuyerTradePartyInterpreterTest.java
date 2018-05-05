package com.project.group4.models.interpreter;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyerTradePartyInterpreterTest {

    private TradeContact tradeContact;
    private Address address;

    @Before
    public void setup() {
        TradeContact tradeContact = new TradeContact();
        Address address = new Address();
    }

    @Test
    public void shouldReturnInfoTest() {
        BuyerTradePartyInterpreter buyerTradePartyInterpreter = BuyerTradePartyInterpreter.builder()
                .id("id")
                .globalId("global Id")
                .name("name")
                .taxRegistration("tax Register")
                .tradeContact(tradeContact)
                .address(address)
                .build();

        assertEquals("id", buyerTradePartyInterpreter.getId());
        assertEquals("global Id", buyerTradePartyInterpreter.getGlobalId());
        assertEquals("name", buyerTradePartyInterpreter.getName());
        assertEquals("tax Register", buyerTradePartyInterpreter.getTaxRegistration());
        assertEquals(tradeContact, buyerTradePartyInterpreter.getTradeContact());
        assertEquals(address, buyerTradePartyInterpreter.getAddress());
    }
}