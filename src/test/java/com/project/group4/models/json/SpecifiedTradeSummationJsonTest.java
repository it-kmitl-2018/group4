package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecifiedTradeSummationJsonTest {

    private String taxTotalAmount;
    private String pretaxTotalAmount;
    private String totalAmount;

    @Test
    public void buildTest() {
        SpecifiedTradeSummationJson specifiedTradeSummationJson = SpecifiedTradeSummationJson.builder()
                .taxTotalAmount(this.taxTotalAmount)
                .pretaxTotalAmount(this.pretaxTotalAmount)
                .totalAmount(this.totalAmount)
                .build();

        assertEquals(this.taxTotalAmount, specifiedTradeSummationJson.taxTotalAmount);
        assertEquals(this.pretaxTotalAmount, specifiedTradeSummationJson.pretaxTotalAmount);
        assertEquals(this.totalAmount, specifiedTradeSummationJson.totalAmount);
    }

}