package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndividualTradeProductJsonTest {

    private String batchId;
    private String expiryDateTime;

    @Before
    public void setup() {
        batchId = "testBatchId";
        expiryDateTime = "testExpiryDateTime";
    }

    @Test
    public void buildTest() {
        IndividualTradeProductJson individualTradeProductJson = IndividualTradeProductJson.builder()
                .batchId(batchId)
                .expiryDateTime(expiryDateTime)
                .build();

        assertEquals(batchId, individualTradeProductJson.getBatchId());
        assertEquals(expiryDateTime, individualTradeProductJson.getExpiryDateTime());
    }

    @Test
    public void jsonStringTest() {
        IndividualTradeProductJson individualTradeProductJson = IndividualTradeProductJson.builder()
                .batchId(batchId)
                .expiryDateTime(expiryDateTime)
                .build();

        String expectedJson = "{\n" +
                "    \"batch_id\" : \"testBatchId\",\n" +
                "    \"expiry_date_time\" : \"testExpiryDateTime\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(individualTradeProductJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        IndividualTradeProductJson individualTradeProductJson = IndividualTradeProductJson.builder()
                .batchId(batchId)
                .expiryDateTime(expiryDateTime)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(individualTradeProductJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}