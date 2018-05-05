package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicableTradeDeliveryTermsJsonTest {

    private String deliveryTypeCode;

    @Test
    public void buildTest() {
        ApplicableTradeDeliveryTermsJson applicableTradeDeliveryTermsJson = ApplicableTradeDeliveryTermsJson.builder()
                .deliveryTypeCode(this.deliveryTypeCode)
                .build();

        assertEquals(this.deliveryTypeCode, applicableTradeDeliveryTermsJson.deliveryTypeCode);
    }
}