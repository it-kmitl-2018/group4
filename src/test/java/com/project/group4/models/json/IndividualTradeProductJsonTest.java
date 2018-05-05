package com.project.group4.models.json;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndividualTradeProductJsonTest {

    private String batchId;
    private String expiryDateTime;

    @Before
    public void setup() {
        this.batchId = "testBatchId";
        this.expiryDateTime = "testExpiryDateTime";
    }

    @Test
    public void buildTest() {
        IndividualTradeProductJson individualTradeProductJson = IndividualTradeProductJson.builder()
                .batchId(this.batchId)
                .expiryDateTime(this.expiryDateTime)
                .build();

        assertEquals(this.batchId, individualTradeProductJson.batchId);
        assertEquals(this.expiryDateTime, individualTradeProductJson.expiryDateTime);
    }
}