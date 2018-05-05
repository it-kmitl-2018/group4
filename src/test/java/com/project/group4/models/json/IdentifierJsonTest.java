package com.project.group4.models.json;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentifierJsonTest {

    private String id;

    @Before
    public void setup() {
        this.id = "testID";
    }

    @Test
    public void buildTest() {
        IdentifierJson identifierJson = IdentifierJson.builder()
                .id(this.id)
                .build();

        assertEquals(this.id, identifierJson.id);
    }
}