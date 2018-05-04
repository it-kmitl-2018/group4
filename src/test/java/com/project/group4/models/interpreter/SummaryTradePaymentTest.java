package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SummaryTradePaymentTest {

    private SummaryTradePayment summaryTradePayment;

    @Before
    public void setup() {
        summaryTradePayment = new SummaryTradePayment();
    }

    @Test
    public void summaryTradePaymentNotNullTest() { assertNotNull(summaryTradePayment);
    }

    @Test
    public void nullTest() {
        assertNull(summaryTradePayment.getOriginalInfoAmount());
        assertNull(summaryTradePayment.getLineTotalAmount());
        assertNull(summaryTradePayment.getDifferenceSalesInfoAmount());
        assertNull(summaryTradePayment.getAllowanceTotalAmount());
        assertNull(summaryTradePayment.getChargeTotalAmount());
        assertNull(summaryTradePayment.getTaxBasisTotalAmount());
        assertNull(summaryTradePayment.getTaxTotalAmount());
        assertNull(summaryTradePayment.getGrandTotalAmount());
    }

    @Test
    public void getterSetterTest() {
        summaryTradePayment.setOriginalInfoAmount("7.00");
        summaryTradePayment.setLineTotalAmount("7.00");
        summaryTradePayment.setDifferenceSalesInfoAmount("100.00");
        summaryTradePayment.setAllowanceTotalAmount("VAT");
        summaryTradePayment.setChargeTotalAmount("7");
        summaryTradePayment.setTaxBasisTotalAmount("7.00");
        summaryTradePayment.setTaxTotalAmount("7.00");
        summaryTradePayment.setGrandTotalAmount("7.00");

        assertEquals("7.00", summaryTradePayment.getOriginalInfoAmount());
        assertEquals("7.00", summaryTradePayment.getLineTotalAmount());
        assertEquals("100.00", summaryTradePayment.getDifferenceSalesInfoAmount());
        assertEquals("VAT", summaryTradePayment.getAllowanceTotalAmount());
        assertEquals("7", summaryTradePayment.getChargeTotalAmount());
        assertEquals("7.00", summaryTradePayment.getTaxBasisTotalAmount());
        assertEquals("7.00", summaryTradePayment.getTaxTotalAmount());
        assertEquals("7.00", summaryTradePayment.getGrandTotalAmount());
    }

}