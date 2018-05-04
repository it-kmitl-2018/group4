package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TradePaymentInfoTest {

    private TradePaymentInfo tradePaymentInfo;

    @Before
    public void setup() {
        tradePaymentInfo = new TradePaymentInfo();
    }

    @Test
    public void tradePaymentInfoNotNullTest() {
        assertNotNull(tradePaymentInfo);
    }

    @Test
    public void nullTest() {
        assertNull(tradePaymentInfo.getTypeCode());
        assertNull(tradePaymentInfo.getDescription());
        assertNull(tradePaymentInfo.getDueDateTime());
    }

    @Test
    public void getterSetterTest() {
        tradePaymentInfo.setTypeCode("VAT");
        tradePaymentInfo.setDescription("การเสียภาษี");
        tradePaymentInfo.setDueDateTime("1/5/2018");

        assertEquals("VAT", tradePaymentInfo.getTypeCode());
        assertEquals("การเสียภาษี", tradePaymentInfo.getDescription());
        assertEquals("1/5/2018", tradePaymentInfo.getDueDateTime());
    }
}