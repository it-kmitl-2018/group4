package com.project.group4.jsonwrappers;

import com.project.group4.models.interpreter.ActualDeliverySupplyChainEventInterpreter;
import com.project.group4.models.json.ActualDeliverySupplyChainEventJson;

public class ActualDeliverySupplyChainEventWrapper {

    public ActualDeliverySupplyChainEventInterpreter actualDeliverySupplyChainEventInterpreter;

    public ActualDeliverySupplyChainEventWrapper(ActualDeliverySupplyChainEventInterpreter actualDeliverySupplyChainEventInterpreter) {
        this.actualDeliverySupplyChainEventInterpreter = actualDeliverySupplyChainEventInterpreter;
    }

    private ActualDeliverySupplyChainEventJson getModelClass(){
        ActualDeliverySupplyChainEventJson actualDeliverySupplyChainEventJson =
                ActualDeliverySupplyChainEventJson.builder()
                .occurrenceDate(actualDeliverySupplyChainEventInterpreter.getOccurrenceDate())
                .build();
        return actualDeliverySupplyChainEventJson;
    }
}
