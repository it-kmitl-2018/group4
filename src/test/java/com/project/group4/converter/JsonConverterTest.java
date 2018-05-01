package com.project.group4.converter;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JsonConverterTest {

    private class TestJson {

        @JsonProperty("strings")
        private List<String> strings = Arrays.asList("a", "b", "c");
    }

    private String jsonString = "{\r\n  \"strings\" : [ \"a\", \"b\", \"c\" ]\r\n}";

//    @Test
//    public void crateJsonStringTest() {
//        assertEquals(jsonString, JsonConverter.crateJsonString(new TestJson()));
//    }

    @Test
    public void crateJsonFileTest() {
        assertTrue(JsonConverter.crateJsonFile(new TestJson(), "testJson"));
    }
}