package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExchangedDocumentContextJsonTest {

    private IdentifierJson identifierJson;

    @Test
    public void buildTest() {
        ExchangedDocumentContextJson exchangedDocumentContextJson = ExchangedDocumentContextJson.builder()
                .identifierJson(this.identifierJson)
                .build();

        assertEquals(this.identifierJson, exchangedDocumentContextJson.identifierJson);
    }
}