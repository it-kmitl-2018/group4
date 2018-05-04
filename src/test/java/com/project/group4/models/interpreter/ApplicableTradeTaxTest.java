package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ApplicableTradeTaxTest {

    private ApplicableTradeTax applicableTradeTax;

    @Before
    public void setup() {
        applicableTradeTax = new ApplicableTradeTax();
    }

    @Test
    public void taxInfoNotNullTest() {
        assertNotNull(applicableTradeTax);
    }

    @Test
    public void nullTest() {
        assertNull(applicableTradeTax.getTypeCode());
        assertNull(applicableTradeTax.getCalculatedRate());
        assertNull(applicableTradeTax.getBasisAmount());
        assertNull(applicableTradeTax.getCalculatedAmount());
    }

    @Test
    public void getterSetterTest() {
        applicableTradeTax.setTypeCode("VAT");
        applicableTradeTax.setCalculatedRate("7");
        applicableTradeTax.setBasisAmount("100.00");
        applicableTradeTax.setCalculatedAmount("7.00");

        assertEquals("VAT", applicableTradeTax.getTypeCode());
        assertEquals("7", applicableTradeTax.getCalculatedRate());
        assertEquals("100.00", applicableTradeTax.getBasisAmount());
        assertEquals("7.00", applicableTradeTax.getCalculatedAmount());
    }
}