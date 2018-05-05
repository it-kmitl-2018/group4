package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ApplicableTradeTaxInterpreterTest {

    @Test
    public void shouldReturnInfoTest() {
        ApplicableTradeTaxInterpreter applicableTradeTaxInterpreter =
                ApplicableTradeTaxInterpreter.builder()
                        .typeCode("VAT")
                        .calculatedRate("7")
                        .basisAmount("100.00")
                        .calculatedAmount("7.00")
                        .build();

        assertEquals("VAT", applicableTradeTaxInterpreter.getTypeCode());
        assertEquals("7", applicableTradeTaxInterpreter.getCalculatedRate());
        assertEquals("100.00", applicableTradeTaxInterpreter.getBasisAmount());
        assertEquals("7.00", applicableTradeTaxInterpreter.getCalculatedAmount());
    }
}