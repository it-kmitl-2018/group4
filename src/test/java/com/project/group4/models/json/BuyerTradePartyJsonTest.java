package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuyerTradePartyJsonTest {

    private String taxNumber;
    private String branchNumber;
    private String nameEn;
    private String nameTh;
    private String email;
    private String fax;
    private Address address;

    @Before
    public void setup(){
        taxNumber = "1234";
        branchNumber = "1234";
        nameEn = "nameEn";
        nameTh = "nameTh";
        email = "1223@123.com";
        fax = "1234";
    }

    @Test
    public void buildTest() {
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .taxNumber(taxNumber)
                .branchNumber(branchNumber)
                .nameEn(nameEn)
                .nameTh(nameTh)
                .email(email)
                .fax(fax)
                .address(address)
                .build();

        assertEquals(taxNumber, buyerTradePartyJson.taxNumber);
        assertEquals(branchNumber, buyerTradePartyJson.branchNumber);
        assertEquals(nameEn, buyerTradePartyJson.nameEn);
        assertEquals(nameTh, buyerTradePartyJson.nameTh);
        assertEquals(email, buyerTradePartyJson.email);
        assertEquals(fax, buyerTradePartyJson.fax);
        assertEquals(address, buyerTradePartyJson.address);
    }

    @Test
    public void jsonStringTest(){
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .taxNumber(taxNumber)
                .branchNumber(branchNumber)
                .nameEn(nameEn)
                .nameTh(nameTh)
                .email(email)
                .fax(fax)
                .address(address)
                .build();

        String expectedJson = "{\n" +
                "    \"tax_number\" : \"1234\",\n" +
                "    \"branch_number\" : \"1234\",\n" +
                "    \"name_en\" : \"nameEn\",\n" +
                "    \"name_th\" : \"nameTh\",\n" +
                "    \"email\" : \"1223@123.com\",\n" +
                "    \"fax\" : \"1234\",\n" +
                "    \"address\" : null\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(buyerTradePartyJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest(){
        BuyerTradePartyJson buyerTradePartyJson = BuyerTradePartyJson.builder()
                .taxNumber(taxNumber)
                .branchNumber(branchNumber)
                .nameEn(nameEn)
                .nameTh(nameTh)
                .email(email)
                .fax(fax)
                .address(address)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(buyerTradePartyJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}