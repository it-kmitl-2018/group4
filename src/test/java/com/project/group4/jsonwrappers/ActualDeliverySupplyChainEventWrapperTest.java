package com.project.group4.jsonwrappers;

import com.project.group4.models.interpreter.ActualDeliverySupplyChainEventInterpreter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ActualDeliverySupplyChainEventWrapperTest {

    private ActualDeliverySupplyChainEventInterpreter actualDeliverySupplyChainEventInterpreter;

    @Test
    public void shouldGetAllInfo(){
        actualDeliverySupplyChainEventInterpreter = ActualDeliverySupplyChainEventInterpreter.builder()
                .occurrenceDate("21/11/2561")
                .build();
        ActualDeliverySupplyChainEventWrapper actualDeliverySupplyChainEventWrapper =
                new ActualDeliverySupplyChainEventWrapper(actualDeliverySupplyChainEventInterpreter);

        assertEquals("21/11/2561", actualDeliverySupplyChainEventWrapper.actualDeliverySupplyChainEventInterpreter);
    }
}