package com.project.group4.models.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecifiedTradeAllowanceChargeInterpreterTest {

    @Test
    public void shouldReturnInfoTest() {
        SpecifiedTradeAllowanceChargeInterpreter specifiedTradeAllowanceChargeInterpreter=
                SpecifiedTradeAllowanceChargeInterpreter.builder()
                .chargeIndicator("True")
                .actualAmount("100.00")
                .reasonCode("95")
                .reason("ส่วนลดจากราคาปกติ")
                .build();

        assertEquals("True", specifiedTradeAllowanceChargeInterpreter.getChargeIndicator());
        assertEquals("100.00", specifiedTradeAllowanceChargeInterpreter.getActualAmount());
        assertEquals("95", specifiedTradeAllowanceChargeInterpreter.getReasonCode());
        assertEquals("ส่วนลดจากราคาปกติ", specifiedTradeAllowanceChargeInterpreter.getReason());
    }
}