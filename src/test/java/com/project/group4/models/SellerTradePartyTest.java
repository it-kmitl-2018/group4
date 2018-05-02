package com.project.group4.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SellerTradePartyTest {

    private SellerTradeParty sellerTradeParty;
    private TradeContact tradeContact;
    private Address address;

    @Before
    public void setup() {
        sellerTradeParty = new SellerTradeParty();
        tradeContact = new TradeContact();
        address = new Address();
    }

    @Test
    public void sellerTradePartyNotNullTest() {
        assertNotNull(sellerTradeParty);
    }

    @Test
    public void nullTest() {
        assertNull(sellerTradeParty.getId());
        assertNull(sellerTradeParty.getGlobalId());
        assertNull(sellerTradeParty.getName());
        assertNull(sellerTradeParty.getTaxRegistration());
        assertNull(sellerTradeParty.getTradeContact());
        assertNull(sellerTradeParty.getAddress());
    }

    @Test
    public void getterSetterTest() {
        sellerTradeParty.setId("id");
        sellerTradeParty.setGlobalId("global id");
        sellerTradeParty.setName("name");
        sellerTradeParty.setTaxRegistration("tax registration");
        sellerTradeParty.setTradeContact(tradeContact);
        sellerTradeParty.setAddress(address);

        assertEquals("id", sellerTradeParty.getId());
        assertEquals("global id", sellerTradeParty.getGlobalId());
        assertEquals("name", sellerTradeParty.getName());
        assertEquals("tax registration", sellerTradeParty.getTaxRegistration());
        assertEquals(tradeContact, sellerTradeParty.getTradeContact());
        assertEquals(address, sellerTradeParty.getAddress());
    }
}
