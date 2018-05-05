package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActualDeliverySupplyChainEventJsonTest {

    @Test
    public void buildTest() {
        ActualDeliverySupplyChainEventJson actualDeliverySupplyChainEventJson = ActualDeliverySupplyChainEventJson.builder()
                .occurrenceDate("12/11/2561")
                .build();

        assertEquals("12/11/2561", actualDeliverySupplyChainEventJson.occurrenceDate);
    }
}