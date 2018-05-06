package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
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

    @Before
    public void setup() {
        id = "testID";
        name = "testName";
        typeCode = "testTypeCode";
        issueDateTime = "testIssueDateTime";
        purpose = "testPurpose";
        purposeCode = "testPurposeCode";
        globalId = "testGlobalID";
        creationDateTime = "testCreationDateTime";
        includedNoteJson = IncludedNoteJson.builder().build();
    }

    @Test
    public void buildTest() {
        ExchangedDocumentJson exchangedDocumentJson = ExchangedDocumentJson.builder()
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .purpose(purpose)
                .purposeCode(purposeCode)
                .globalId(globalId)
                .creationDateTime(creationDateTime)
                .includedNoteJson(includedNoteJson)
                .build();

        assertEquals(id, exchangedDocumentJson.getId());
        assertEquals(name, exchangedDocumentJson.getName());
        assertEquals(typeCode, exchangedDocumentJson.getTypeCode());
        assertEquals(issueDateTime, exchangedDocumentJson.getIssueDateTime());
        assertEquals(purpose, exchangedDocumentJson.getPurpose());
        assertEquals(purposeCode, exchangedDocumentJson.getPurposeCode());
        assertEquals(globalId, exchangedDocumentJson.getGlobalId());
        assertEquals(creationDateTime, exchangedDocumentJson.getCreationDateTime());
        assertEquals(includedNoteJson, exchangedDocumentJson.getIncludedNoteJson());
    }

    @Test
    public void jsonStringTest() {
        ExchangedDocumentJson exchangedDocumentJson = ExchangedDocumentJson.builder()
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .purpose(purpose)
                .purposeCode(purposeCode)
                .globalId(globalId)
                .creationDateTime(creationDateTime)
                .includedNoteJson(includedNoteJson)
                .build();

        String expectedJson = "{\n" +
                "    \"id\" : \"testID\",\n" +
                "    \"name\" : \"testName\",\n" +
                "    \"type_code\" : \"testTypeCode\",\n" +
                "    \"issue_date_time\" : \"testIssueDateTime\",\n" +
                "    \"purpose\" : \"testPurpose\",\n" +
                "    \"purpose_code\" : \"testPurposeCode\",\n" +
                "    \"global_id\" : \"testGlobalID\",\n" +
                "    \"creation_date_time\" : \"testCreationDateTime\",\n" +
                "    \"included_note\" : {\n" +
                "        \"subject\" : null,\n" +
                "        \"content\" : null\n" +
                "    }\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(exchangedDocumentJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        ExchangedDocumentJson exchangedDocumentJson = ExchangedDocumentJson.builder()
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .purpose(purpose)
                .purposeCode(purposeCode)
                .globalId(globalId)
                .creationDateTime(creationDateTime)
                .includedNoteJson(includedNoteJson)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(exchangedDocumentJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}