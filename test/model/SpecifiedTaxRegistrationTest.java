package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpecifiedTaxRegistrationTest {

    private SpecifiedTaxRegistration specifiedTaxRegistration;

    @Before
    public void setup() {
        specifiedTaxRegistration = new SpecifiedTaxRegistration();
    }

    @Test
    public void specifiedTaxRegistrationNotNullTest() {
        assertNotNull(specifiedTaxRegistration);
    }

    @Test
    public void idNullTest() {
        assertNull(specifiedTaxRegistration.getId());
    }

    @Test
    public void idGetSetTest() {
        specifiedTaxRegistration.setId("1023920113204");
        assertEquals("1023920113204", specifiedTaxRegistration.getId());
    }
}