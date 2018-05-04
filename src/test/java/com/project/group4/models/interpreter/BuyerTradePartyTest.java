package com.project.group4.models.interpreter;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BuyerTradePartyTest {

    private BuyerTradeParty buyerTradeParty;
    private TradeContact tradeContact;
    private Address address;

    @Before
    public void setup() {
        buyerTradeParty = new BuyerTradeParty();
        tradeContact = new TradeContact();
        address = new Address();
    }

    @Test
    public void buyerTradePartyNotNullTest() {
        assertNotNull(buyerTradeParty);
    }

    @Test
    public void nullTest() {
        assertNull(buyerTradeParty.getId());
        assertNull(buyerTradeParty.getGlobalId());
        assertNull(buyerTradeParty.getName());
        assertNull(buyerTradeParty.getTaxId());
        assertNull(buyerTradeParty.getTradeContact());
        assertNull(buyerTradeParty.getAddress());
    }

    @Test
    public void getterSetterTest() {
        buyerTradeParty.setId("1234");
        buyerTradeParty.setGlobalId("global 1234");
        buyerTradeParty.setName("name");
        buyerTradeParty.setTaxId("tax id");
        buyerTradeParty.setTradeContact(tradeContact);
        buyerTradeParty.setAddress(address);

        assertEquals("1234", buyerTradeParty.getId());
        assertEquals("global 1234", buyerTradeParty.getGlobalId());
        assertEquals("name", buyerTradeParty.getName());
        assertEquals("tax id", buyerTradeParty.getTaxId());
        assertEquals(tradeContact, buyerTradeParty.getTradeContact());
        assertEquals(address, buyerTradeParty.getAddress());
    }
}