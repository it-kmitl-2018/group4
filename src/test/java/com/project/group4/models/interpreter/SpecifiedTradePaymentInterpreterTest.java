package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SpecifiedTradePaymentInterpreterTest {

    @Test
    public void shouldReturnInfoTest() {
        SpecifiedTradePaymentInterpreter specifiedTradePaymentInterpreter =
                SpecifiedTradePaymentInterpreter.builder()
                        .typeCode("VAT")
                        .description("การเสียภาษี")
                        .dueDateTime("1/5/2018")
                        .build();

        assertEquals("VAT", specifiedTradePaymentInterpreter.getTypeCode());
        assertEquals("การเสียภาษี", specifiedTradePaymentInterpreter.getDescription());
        assertEquals("1/5/2018", specifiedTradePaymentInterpreter.getDueDateTime());
    }
}