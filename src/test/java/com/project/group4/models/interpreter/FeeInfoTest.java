package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class FeeInfoTest {

    private FeeInfo feeInfo;

    @Before
    public void setup() {
        feeInfo = new FeeInfo();
    }

    @Test
    public void feeInfoNotNullTest() {
        assertNotNull(feeInfo);
    }

    @Test
    public void nullTest() {
        assertNull(feeInfo.getChargeIndicator());
        assertNull(feeInfo.getActualAmount());
        assertNull(feeInfo.getReasonCode());
        assertNull(feeInfo.getReason());
    }

    @Test
    public void getterSetterTest() {
        feeInfo.setChargeIndicator("True");
        feeInfo.setActualAmount("100.00");
        feeInfo.setReasonCode("95");
        feeInfo.setReason("ส่วนลดจากราคาปกติ");

        assertEquals("True", feeInfo.getChargeIndicator());
        assertEquals("100.00", feeInfo.getActualAmount());
        assertEquals("95", feeInfo.getReasonCode());
        assertEquals("ส่วนลดจากราคาปกติ", feeInfo.getReason());
    }
}