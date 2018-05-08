package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TradeContactJsonTest {

    private String personName;
    private String departmentName;
    private String uriId;
    private String telephoneNumber;

    @Before
    public void setup() {
        personName = "personName";
        departmentName = "departmentName";
        uriId = "uriId";
        telephoneNumber = "telephoneNumber";
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
                "    \"person_name\" : \"personName\",\n" +
                "    \"department_name\" : \"departmentName\",\n" +
                "    \"uriid\" : \"uriId\",\n" +
                "    \"complete_number\" : \"telephoneNumber\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(tradeContactJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        TradeContactJson tradeContactJson = TradeContactJson.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .uriId(this.uriId)
                .telephoneNumber(this.telephoneNumber)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(tradeContactJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}
