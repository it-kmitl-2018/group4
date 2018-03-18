package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuyerTradePartyTest {

   private BuyerTradeParty buyerTradeParty;

    @Before
    public void setup() {
        buyerTradeParty = new BuyerTradeParty();
    }

    @Test
    public void buyerTradePartyNotNullTest() {
        assertNotNull(buyerTradeParty);
    }

    @Test
    public void idNullTest() {
        assertNull(buyerTradeParty.getId());
    }

    @Test
    public void idGetSetTest() {
        buyerTradeParty.setId("ABCDEFGHIJKLMNOPQRST123456789012345");
        assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", buyerTradeParty.getId());
    }

    @Test
    public void globalIdNullTest() {
        assertNull(buyerTradeParty.getGlobalId());
    }

    @Test
    public void globalIdGetSetTest() {
        buyerTradeParty.setGlobalId("ABCDEFGHIJKLMNOPQRST123456789012345");
        assertEquals("ABCDEFGHIJKLMNOPQRST123456789012345", buyerTradeParty.getGlobalId());
    }

    @Test
    public void nameNullTest() {
        assertNull(buyerTradeParty.getName());
    }

    @Test
    public void nameGetSetTest() {
        buyerTradeParty.setName("ธารา ยืนขำ");
        assertEquals("ธารา ยืนขำ", buyerTradeParty.getName());
    }

    @Test
    public void SpecifiedTaxRegistrationNullTest() {
        assertNull(buyerTradeParty.getSpecifiedTaxRegistration());
    }

    @Test
    public void SpecifiedTaxRegistrationGetSetTest() {
        SpecifiedTaxRegistration specifiedTaxRegistration = new SpecifiedTaxRegistration();
        buyerTradeParty.setSpecifiedTaxRegistration(specifiedTaxRegistration);
        assertEquals(specifiedTaxRegistration, buyerTradeParty.getSpecifiedTaxRegistration());
    }

    @Test
    public void defindTradeContactNullTest() {
        assertNull(buyerTradeParty.getDefindTradeContact());
    }

    @Test
    public void defindTradeContactGetSetTest() {
        DefindTradeContact defindTradeContact = new DefindTradeContact();
        buyerTradeParty.setDefindTradeContact(defindTradeContact);
        assertEquals(defindTradeContact, buyerTradeParty.getDefindTradeContact());
    }

    @Test
    public void emailUriUniversalCommunicationNullTest() {
        assertNull(buyerTradeParty.getEmailUriUniversalCommunication());
    }

    @Test
    public void emailUriUniversalCommunicationGetSetTest() {
        EmailUriUniversalCommunication emailUriUniversalCommunication = new EmailUriUniversalCommunication();
        buyerTradeParty.setEmailUriUniversalCommunication(emailUriUniversalCommunication);
        assertEquals(emailUriUniversalCommunication, buyerTradeParty.getEmailUriUniversalCommunication());
    }

    @Test
    public void telephoneUniversalCommunicationNullTest() {
        assertNull(buyerTradeParty.getTelephoneUniversalCommunication());
    }

    @Test
    public void telephoneUniversalCommunicationGetSetTest() {
        TelephoneUniversalCommunication telephoneUniversalCommunication = new TelephoneUniversalCommunication();
        buyerTradeParty.setTelephoneUniversalCommunication(telephoneUniversalCommunication);
        assertEquals(telephoneUniversalCommunication, buyerTradeParty.getTelephoneUniversalCommunication());
    }

    @Test
    public void postalTradeAddressNullTest() {
        assertNull(buyerTradeParty.getPostalTradeAddress());
    }

    @Test
    public void postalTradeAddressGetSetTest() {
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        buyerTradeParty.setPostalTradeAddress(postalTradeAddress);
        assertEquals(postalTradeAddress, buyerTradeParty.getPostalTradeAddress());
    }
}