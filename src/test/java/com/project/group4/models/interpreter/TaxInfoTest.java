package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TaxInfoTest {

    private TaxInfo taxInfo;

    @Before
    public void setup() {
        taxInfo = new TaxInfo();
    }

    @Test
    public void taxInfoNotNullTest() {
        assertNotNull(taxInfo);
    }

    @Test
    public void nullTest() {
        assertNull(taxInfo.getTypeCode());
        assertNull(taxInfo.getCalculatedRate());
        assertNull(taxInfo.getBasisAmount());
        assertNull(taxInfo.getCalculatedAmount());
    }

    @Test
    public void getterSetterTest() {
        taxInfo.setTypeCode("VAT");
        taxInfo.setCalculatedRate("7");
        taxInfo.setBasisAmount("100.00");
        taxInfo.setCalculatedAmount("7.00");

        assertEquals("VAT", taxInfo.getTypeCode());
        assertEquals("7", taxInfo.getCalculatedRate());
        assertEquals("100.00", taxInfo.getBasisAmount());
        assertEquals("7.00", taxInfo.getCalculatedAmount());
    }
}