package com.project.group4.models.interpreter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActualDeliverySupplyChainEventInterpreterTest {

    @Test
    public void shouldReturnInfoTest(){
        ActualDeliverySupplyChainEventInterpreter actualDeliverySupplyChainEventInterpreter =
                ActualDeliverySupplyChainEventInterpreter.builder()
                .occurrenceDate("30/02/59")
                .build();
        assertEquals("30/02/59", actualDeliverySupplyChainEventInterpreter.getOccurrenceDate());
    }
}