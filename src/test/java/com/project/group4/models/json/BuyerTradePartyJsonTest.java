package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuyerTradePartyJsonTest {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistration;
    private TradeContact tradeContact;
    private Address address;

    @Before
    public void setup(){
        id = "1234";
        globalId = "1234";
        name = "name";
        taxRegistration = "tax register";
    }

    @Test
    public void buildTest() {
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .id(id)
                .globalId(globalId)
                .name(name)
                .taxRegistration(taxRegistration)
                .tradeContact(tradeContact)
                .address(address)
                .build();

        assertEquals(id, buyerTradePartyJson.id);
        assertEquals(globalId, buyerTradePartyJson.globalId);
        assertEquals(name, buyerTradePartyJson.name);
        assertEquals(taxRegistration, buyerTradePartyJson.taxRegistration);
        assertEquals(tradeContact, buyerTradePartyJson.tradeContact);
        assertEquals(address, buyerTradePartyJson.address);
    }

    @Test
    public void jsonStringTest(){
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .id(id)
                .globalId(globalId)
                .name(name)
                .taxRegistration(taxRegistration)
                .tradeContact(tradeContact)
                .address(address)
                .build();

        String expectedJson = "{\n" +
                "    \"id\" : \"1234\",\n" +
                "    \"global_id\" : \"1234\",\n" +
                "    \"name\" : \"name\",\n" +
                "    \"tax_registration\" : \"tax register\",\n" +
                "    \"trade_contact\" : null,\n" +
                "    \"address\" : null\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(buyerTradePartyJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest(){
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .id(id)
                .globalId(globalId)
                .name(name)
                .taxRegistration(taxRegistration)
                .tradeContact(tradeContact)
                .address(address)
                .build();
        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(buyerTradePartyJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}