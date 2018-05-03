package com.project.group4.models.jsonframe;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncludedNoteJsonTest {

    private String subject;
    private String content;

    @Test
    public void buildTest() {
        IncludedNoteJson includedNoteJson = IncludedNoteJson.builder()
                .subject(this.subject)
                .content(this.content)
                .build();

        assertEquals(this.subject, includedNoteJson.subject);
        assertEquals(this.content, includedNoteJson.content);
    }
}