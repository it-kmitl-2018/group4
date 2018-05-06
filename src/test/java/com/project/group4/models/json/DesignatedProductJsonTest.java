package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DesignatedProductJsonTest {

    private String classCode;
    private String className;

    @Before
    public void setup() {
        classCode = "testCode";
        className = "testName";
    }

    @Test
    public void buildTest() {
        DesignatedProductJson designatedProductJson = DesignatedProductJson.builder()
                .classCode(classCode)
                .className(className)
                .build();

        assertEquals(classCode, designatedProductJson.getClassCode());
        assertEquals(className, designatedProductJson.getClassName());
    }

    @Test
    public void jsonStringTest() {
        DesignatedProductJson designatedProductJson = DesignatedProductJson.builder()
                .classCode(classCode)
                .className(className)
                .build();

        String expectedJson = "{\n" +
                "    \"class_code\" : \"testCode\",\n" +
                "    \"class_name\" : \"testName\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(designatedProductJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        DesignatedProductJson designatedProductJson = DesignatedProductJson.builder()
                .classCode(classCode)
                .className(className)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(designatedProductJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}