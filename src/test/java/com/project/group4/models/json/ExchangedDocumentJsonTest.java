package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExchangedDocumentJsonTest {

    private String id;
    private String name;
    private String typeCode;
    private String issueDateTime;
    private String purpose;
    private String purposeCode;
    private String globalId;
    private String creationDateTime;
    private IncludedNoteJson includedNoteJson;

    @Test
    public void buildTest() {
        ExchangedDocumentJson exchangedDocumentJson = ExchangedDocumentJson.builder()
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .globalId(this.globalId)
                .creationDateTime(this.creationDateTime)
                .includedNoteJson(this.includedNoteJson)
                .build();

        assertEquals(this.id, exchangedDocumentJson.id);
        assertEquals(this.name, exchangedDocumentJson.name);
        assertEquals(this.typeCode, exchangedDocumentJson.typeCode);
        assertEquals(this.issueDateTime, exchangedDocumentJson.issueDateTime);
        assertEquals(this.purpose, exchangedDocumentJson.purpose);
        assertEquals(this.purposeCode, exchangedDocumentJson.purposeCode);
        assertEquals(this.globalId, exchangedDocumentJson.globalId);
        assertEquals(this.creationDateTime, exchangedDocumentJson.creationDateTime);
        assertEquals(this.includedNoteJson, exchangedDocumentJson.includedNoteJson);
    }
}