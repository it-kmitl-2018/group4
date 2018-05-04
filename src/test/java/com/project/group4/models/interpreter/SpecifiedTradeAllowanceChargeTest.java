package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SpecifiedTradeAllowanceChargeTest {

    private SpecifiedTradeAllowanceCharge specifiedTradeAllowanceCharge;

    @Before
    public void setup() {
        specifiedTradeAllowanceCharge = new SpecifiedTradeAllowanceCharge();
    }

    @Test
    public void feeInfoNotNullTest() {
        assertNotNull(specifiedTradeAllowanceCharge);
    }

    @Test
    public void nullTest() {
        assertNull(specifiedTradeAllowanceCharge.getChargeIndicator());
        assertNull(specifiedTradeAllowanceCharge.getActualAmount());
        assertNull(specifiedTradeAllowanceCharge.getReasonCode());
        assertNull(specifiedTradeAllowanceCharge.getReason());
    }

    @Test
    public void getterSetterTest() {
        specifiedTradeAllowanceCharge.setChargeIndicator("True");
        specifiedTradeAllowanceCharge.setActualAmount("100.00");
        specifiedTradeAllowanceCharge.setReasonCode("95");
        specifiedTradeAllowanceCharge.setReason("ส่วนลดจากราคาปกติ");

        assertEquals("True", specifiedTradeAllowanceCharge.getChargeIndicator());
        assertEquals("100.00", specifiedTradeAllowanceCharge.getActualAmount());
        assertEquals("95", specifiedTradeAllowanceCharge.getReasonCode());
        assertEquals("ส่วนลดจากราคาปกติ", specifiedTradeAllowanceCharge.getReason());
    }
}