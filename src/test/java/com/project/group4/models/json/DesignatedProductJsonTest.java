package com.project.group4.models.json;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DesignatedProductJsonTest {

    private String classCode;
    private String className;

    @Before
    public void setup() {
        this.classCode = "testCode";
        this.className = "testName";
    }

    @Test
    public void buildTest() {
        DesignatedProductJson designatedProductJson = DesignatedProductJson.builder()
                .classCode(this.classCode)
                .className(this.className)
                .build();

        assertEquals(this.classCode, designatedProductJson.classCode);
        assertEquals(this.className, designatedProductJson.className);
    }
}