package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecifiedLineTradeDeliveryJsonTest {

    private String billedQuantity;
    private String perPackageUnitQuantity;

    @Test
    public void buildTest() {
        SpecifiedLineTradeDeliveryJson specifiedLineTradeDeliveryJson = SpecifiedLineTradeDeliveryJson.builder()
                .billedQuantity(this.billedQuantity)
                .perPackageUnitQuantity(this.perPackageUnitQuantity)
                .build();

        assertEquals(this.billedQuantity, specifiedLineTradeDeliveryJson.billedQuantity);
        assertEquals(this.perPackageUnitQuantity, specifiedLineTradeDeliveryJson.perPackageUnitQuantity);
    }
}