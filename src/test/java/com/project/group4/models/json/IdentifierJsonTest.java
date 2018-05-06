package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentifierJsonTest {

    private String id;

    @Before
    public void setup() {
        id = "testID";
    }

    @Test
    public void buildTest() {
        IdentifierJson identifierJson = IdentifierJson.builder()
                .id(id)
                .build();

        assertEquals(id, identifierJson.getId());
    }

    @Test
    public void jsonStringTest() {
        IdentifierJson identifierJson = IdentifierJson.builder()
                .id(id)
                .build();

        String expectedJson = "{\n    \"id\" : \"testID\"\n}";
        String actualJson = JsonConverter.crateJsonString(identifierJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        IdentifierJson identifierJson = IdentifierJson.builder()
                .id(id)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(identifierJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}