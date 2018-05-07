package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncludedNoteJsonTest {

    private String subject;
    private String content;

    @Before
    public void setup() {
        subject = "subject";
        content = "content";
    }

    @Test
    public void buildTest() {
        IncludedNoteJson includedNoteJson = IncludedNoteJson.builder()
                .subject(subject)
                .content(content)
                .build();

        assertEquals(subject, includedNoteJson.getSubject());
        assertEquals(content, includedNoteJson.getContent());
    }

    @Test
    public void jsonStringTest() {
        IncludedNoteJson includedNoteJson = IncludedNoteJson.builder()
                .subject(subject)
                .content(content)
                .build();

        String expectedJson = "{\n" +
                "    \"subject\" : \"subject\",\n" +
                "    \"content\" : \"content\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(includedNoteJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        IncludedNoteJson includedNoteJson = IncludedNoteJson.builder()
                .subject(subject)
                .content(content)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(includedNoteJson, "test");

        assertEquals(expectedBool, actualBool);

    }
}