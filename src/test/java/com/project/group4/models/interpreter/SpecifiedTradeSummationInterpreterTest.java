package com.project.group4.models.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecifiedTradeSummationInterpreterTest {

    @Test
    public void shouldReturnInfoTest() {
        SpecifiedTradeSummationInterpreter specifiedTradeSummationInterpreter =
                SpecifiedTradeSummationInterpreter.builder()
                        .originalInfoAmount("7.00")
                        .lineTotalAmount("7.00")
                        .differenceSalesInfoAmount("100.00")
                        .allowanceTotalAmount("VAT")
                        .chargeTotalAmount("7")
                        .taxBasisTotalAmount("7.00")
                        .taxTotalAmount("7.00")
                        .grandTotalAmount("7.00")
                        .build();

        assertEquals("7.00", specifiedTradeSummationInterpreter.getOriginalInfoAmount());
        assertEquals("7.00", specifiedTradeSummationInterpreter.getLineTotalAmount());
        assertEquals("100.00", specifiedTradeSummationInterpreter.getDifferenceSalesInfoAmount());
        assertEquals("VAT", specifiedTradeSummationInterpreter.getAllowanceTotalAmount());
        assertEquals("7", specifiedTradeSummationInterpreter.getChargeTotalAmount());
        assertEquals("7.00", specifiedTradeSummationInterpreter.getTaxBasisTotalAmount());
        assertEquals("7.00", specifiedTradeSummationInterpreter.getTaxTotalAmount());
        assertEquals("7.00", specifiedTradeSummationInterpreter.getGrandTotalAmount());
    }
}