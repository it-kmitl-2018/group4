package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentifierJsonTest {

    private String id;

    @Test
    public void buildTest() {
        IdentifierJson identifierJson = IdentifierJson.builder()
                .id(this.id)
                .build();

        assertEquals(this.id, identifierJson.id);
    }
}