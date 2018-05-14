package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TradeContactJsonTest {

    private String personName;
    private String departmentName;
    private String uriId;
    private String telephoneNumber;

    @Before
    public void setup() {
        personName = "ศิริชัย บินชัย";
        departmentName = "ผู้จัดการฝ่ายการตลาด";
        uriId = "1101223";
        telephoneNumber = "0811234321";
    }

    @Test
    public void buildTest() {
        TradeContactJson tradeContactJson = TradeContactJson.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .uriId(this.uriId)
                .telephoneNumber(this.telephoneNumber)
                .build();

        assertEquals(this.personName, tradeContactJson.personName);
        assertEquals(this.departmentName, tradeContactJson.departmentName);
        assertEquals(this.uriId, tradeContactJson.uriId);
        assertEquals(this.telephoneNumber, tradeContactJson.telephoneNumber);
    }

    @Test
    public void jsonStringTest() {
        TradeContactJson tradeContactJson = TradeContactJson.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .uriId(this.uriId)
                .telephoneNumber(this.telephoneNumber)
                .build();

        String expectedJson = "{\n" +
                "    \"person_name\" : \"ศิริชัย บินชัย\",\n" +
                "    \"department_name\" : \"ผู้จัดการฝ่ายการตลาด\",\n" +
                "    \"uriid\" : \"1101223\",\n" +
                "    \"complete_number\" : \"0811234321\"\n" +
                "}";

        assertEquals(expectedJson, JsonConverter.crateJsonString(tradeContactJson));
    }

    @Test
    public void jsonFileTest() {
        TradeContactJson tradeContactJson = TradeContactJson.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .uriId(this.uriId)
                .telephoneNumber(this.telephoneNumber)
                .build();

        assertTrue(JsonConverter.crateJsonFile(tradeContactJson, "test"));
    }
}