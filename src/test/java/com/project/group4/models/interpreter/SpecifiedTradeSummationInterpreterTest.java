package com.project.group4.models.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecifiedTradeSummationInterpreterTest {

    private Double originalInfoAmount = 7.00;
    private Double lineTotalAmount = 10.00;
    private Double differenceSalesInfoAmount = 100.00;
    private Double allowanceTotalAmount = 500.00;
    private Double chargeTotalAmount = 90.00;
    private Double taxBasisTotalAmount = 100.00;
    private Double taxTotalAmount = 400.00;
    private Double grandTotalAmount = 300.00;

    @Test
    public void shouldReturnInfoTest() {
        SpecifiedTradeSummationInterpreter specifiedTradeSummationInterpreter =
                SpecifiedTradeSummationInterpreter.builder()
                        .originalInfoAmount(originalInfoAmount)
                        .lineTotalAmount(lineTotalAmount)
                        .differenceSalesInfoAmount(differenceSalesInfoAmount)
                        .allowanceTotalAmount(allowanceTotalAmount)
                        .chargeTotalAmount(chargeTotalAmount)
                        .taxBasisTotalAmount(taxBasisTotalAmount)
                        .taxTotalAmount(taxTotalAmount)
                        .grandTotalAmount(grandTotalAmount)
                        .build();

        assertEquals(7.00,originalInfoAmount, specifiedTradeSummationInterpreter.getOriginalInfoAmount());
        assertEquals(10.00, lineTotalAmount, specifiedTradeSummationInterpreter.getLineTotalAmount());
        assertEquals(100.00, differenceSalesInfoAmount, specifiedTradeSummationInterpreter.getDifferenceSalesInfoAmount());
        assertEquals(500.00, allowanceTotalAmount, specifiedTradeSummationInterpreter.getAllowanceTotalAmount());
        assertEquals(90.00, chargeTotalAmount, specifiedTradeSummationInterpreter.getChargeTotalAmount());
        assertEquals(100.00, taxBasisTotalAmount, specifiedTradeSummationInterpreter.getTaxBasisTotalAmount());
        assertEquals(400.00, taxTotalAmount, specifiedTradeSummationInterpreter.getTaxTotalAmount());
        assertEquals(300.00, grandTotalAmount, specifiedTradeSummationInterpreter.getGrandTotalAmount());
    }
}