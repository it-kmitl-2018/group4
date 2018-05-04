package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SpecifiedTradeSummationTest {

    private SpecifiedTradeSummation specifiedTradeSummation;

    @Before
    public void setup() {
        specifiedTradeSummation = new SpecifiedTradeSummation();
    }

    @Test
    public void summaryTradePaymentNotNullTest() { assertNotNull(specifiedTradeSummation); }

    @Test
    public void nullTest() {
        assertNull(specifiedTradeSummation.getOriginalInfoAmount());
        assertNull(specifiedTradeSummation.getLineTotalAmount());
        assertNull(specifiedTradeSummation.getDifferenceSalesInfoAmount());
        assertNull(specifiedTradeSummation.getAllowanceTotalAmount());
        assertNull(specifiedTradeSummation.getChargeTotalAmount());
        assertNull(specifiedTradeSummation.getTaxBasisTotalAmount());
        assertNull(specifiedTradeSummation.getTaxTotalAmount());
        assertNull(specifiedTradeSummation.getGrandTotalAmount());
    }

    @Test
    public void getterSetterTest() {
        specifiedTradeSummation.setOriginalInfoAmount("7.00");
        specifiedTradeSummation.setLineTotalAmount("7.00");
        specifiedTradeSummation.setDifferenceSalesInfoAmount("100.00");
        specifiedTradeSummation.setAllowanceTotalAmount("VAT");
        specifiedTradeSummation.setChargeTotalAmount("7");
        specifiedTradeSummation.setTaxBasisTotalAmount("7.00");
        specifiedTradeSummation.setTaxTotalAmount("7.00");
        specifiedTradeSummation.setGrandTotalAmount("7.00");

        assertEquals("7.00", specifiedTradeSummation.getOriginalInfoAmount());
        assertEquals("7.00", specifiedTradeSummation.getLineTotalAmount());
        assertEquals("100.00", specifiedTradeSummation.getDifferenceSalesInfoAmount());
        assertEquals("VAT", specifiedTradeSummation.getAllowanceTotalAmount());
        assertEquals("7", specifiedTradeSummation.getChargeTotalAmount());
        assertEquals("7.00", specifiedTradeSummation.getTaxBasisTotalAmount());
        assertEquals("7.00", specifiedTradeSummation.getTaxTotalAmount());
        assertEquals("7.00", specifiedTradeSummation.getGrandTotalAmount());
    }
}