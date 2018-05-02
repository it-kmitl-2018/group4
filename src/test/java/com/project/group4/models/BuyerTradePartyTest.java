package com.project.group4.models;

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
    public void AddressNotNullTest() {
        assertNotNull(buyerTradeParty);
    }

    @Test
    public void NullTest() {
        assertNull(buyerTradeParty.getId());
        assertNull(buyerTradeParty.getGlobalId());
        assertNull(buyerTradeParty.getName());
        assertNull(buyerTradeParty.getTaxId());
        assertNull(buyerTradeParty.getTradeContact());
        assertNull(buyerTradeParty.getAddress());
    }

    @Test
    public void GetterSetterTest() {
        buyerTradeParty.setId("1234");
        buyerTradeParty.setGlobalId("1234");
        buyerTradeParty.setName("Nameeeee");
        buyerTradeParty.setTaxId("1234");
        buyerTradeParty.setTradeContact(tradeContact);
        buyerTradeParty.setAddress(address);

        assertEquals("1234", buyerTradeParty.getId());
        assertEquals("1234", buyerTradeParty.getGlobalId());
        assertEquals("Nameeeee", buyerTradeParty.getName());
        assertEquals("1234", buyerTradeParty.getTaxId());
        assertEquals(tradeContact, buyerTradeParty.getTradeContact());
        assertEquals(address, buyerTradeParty.getAddress());
    }
}
