package com.project.group4.models.interpreter;

import com.project.group4.models.IncludedNote;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentInterpreterTest {

    private Date issueDateTime;
    private Date creationDateTime;
    private IncludedNote includedNote;

    @Test
    public void shouldReturnInfoTest() {
        ExchangedDocumentInterpreter exchangedDocumentInterpreter = ExchangedDocumentInterpreter.builder()
                .id("id")
                .name("name")
                .typeCode("typecode")
                .issueDateTime(issueDateTime)
                .purpose("purpose")
                .purposeCode("purposecode")
                .globalId("globalid")
                .creationDateTime(creationDateTime)
                .includedNote(includedNote)
                .build();

        assertEquals("id", exchangedDocumentInterpreter.getId());
        assertEquals("name", exchangedDocumentInterpreter.getName());
        assertEquals("typecode", exchangedDocumentInterpreter.getTypeCode());
        assertEquals(issueDateTime, exchangedDocumentInterpreter.getIssueDateTime());
        assertEquals("purpose", exchangedDocumentInterpreter.getPurpose());
        assertEquals("purposecode", exchangedDocumentInterpreter.getPurposeCode());
        assertEquals("globalid", exchangedDocumentInterpreter.getGlobalId());
        assertEquals(creationDateTime, exchangedDocumentInterpreter.getCreationDateTime());
        assertEquals(includedNote, exchangedDocumentInterpreter.getIncludedNote());
    }
}