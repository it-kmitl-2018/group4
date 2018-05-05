package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TradeContactTest {

    private TradeContact tradeContact;

    @Before
    public void setup() {
        tradeContact = new TradeContact();
    }

    @Test
    public void tradeContactNotNullTest() {
        assertNotNull(tradeContact);
    }

    @Test
    public void nullTest() {
        assertNull(tradeContact.getPersonName());
        assertNull(tradeContact.getDepartmentName());
        assertNull(tradeContact.getEmail());
        assertNull(tradeContact.getTelephoneNumber());
    }

    @Test
    public void getterSetterTest() {
        tradeContact.setPersonName("PersonName");
        tradeContact.setDepartmentName("Department Name");
        tradeContact.setEmail("email@email.com");
        tradeContact.setTelephoneNumber("0871233456");

        assertEquals("PersonName", tradeContact.getPersonName());
        assertEquals("Department Name", tradeContact.getDepartmentName());
        assertEquals("email@email.com", tradeContact.getEmail());
        assertEquals("0871233456", tradeContact.getTelephoneNumber());
    }
}
