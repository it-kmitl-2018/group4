package com.project.group4.models.interpreter;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SpecifiedTradePaymentTest {

    private SpecifiedTradePayment specifiedTradePayment;

    @Before
    public void setup() {
        specifiedTradePayment = new SpecifiedTradePayment();
    }

    @Test
    public void tradePaymentInfoNotNullTest() {
        assertNotNull(specifiedTradePayment);
    }

    @Test
    public void nullTest() {
        assertNull(specifiedTradePayment.getTypeCode());
        assertNull(specifiedTradePayment.getDescription());
        assertNull(specifiedTradePayment.getDueDateTime());
    }

    @Test
    public void getterSetterTest() {
        specifiedTradePayment.setTypeCode("VAT");
        specifiedTradePayment.setDescription("การเสียภาษี");
        specifiedTradePayment.setDueDateTime("1/5/2018");

        assertEquals("VAT", specifiedTradePayment.getTypeCode());
        assertEquals("การเสียภาษี", specifiedTradePayment.getDescription());
        assertEquals("1/5/2018", specifiedTradePayment.getDueDateTime());
    }

}