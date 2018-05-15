package com.project.group4.models.interpreter;

import com.project.group4.models.interpreter.ApplicableTradeDeliveryTermsInterpreter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicableTradeDeliveryTermsInterpreterTest {

    @Test
    public void shouldReturnInfoTest() {
        ApplicableTradeDeliveryTermsInterpreter applicableTradeDeliveryTermsInterpreter = ApplicableTradeDeliveryTermsInterpreter.builder()
                .deliveryTypeCode("00001")
                .build();

        assertEquals("00001", applicableTradeDeliveryTermsInterpreter.getDeliveryTypeCode());
    }

}