package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpecifiedLineTradeDeliveryJsonTest {

    private String billedQuantity;
    private String perPackageUnitQuantity;

    @Before
    public void setup() {
        billedQuantity = "testBilledQuantity";
        perPackageUnitQuantity = "testPerPackageUnitQuantity";
    }

    @Test
    public void buildTest() {
        SpecifiedLineTradeDeliveryJson specifiedLineTradeDeliveryJson = SpecifiedLineTradeDeliveryJson.builder()
                .billedQuantity(billedQuantity)
                .perPackageUnitQuantity(perPackageUnitQuantity)
                .build();

        assertEquals(billedQuantity, specifiedLineTradeDeliveryJson.getBilledQuantity());
        assertEquals(perPackageUnitQuantity, specifiedLineTradeDeliveryJson.getPerPackageUnitQuantity());
    }

    @Test
    public void jsonStringTest() {
        SpecifiedLineTradeDeliveryJson specifiedLineTradeDeliveryJson = SpecifiedLineTradeDeliveryJson.builder()
                .billedQuantity(billedQuantity)
                .perPackageUnitQuantity(perPackageUnitQuantity)
                .build();

        String expectedJson = "{\n" +
                "    \"billed_quantity\" : \"testBilledQuantity\",\n" +
                "    \"per_package_unit_quantity\" : \"testPerPackageUnitQuantity\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(specifiedLineTradeDeliveryJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        SpecifiedLineTradeDeliveryJson specifiedLineTradeDeliveryJson = SpecifiedLineTradeDeliveryJson.builder()
                .billedQuantity(billedQuantity)
                .perPackageUnitQuantity(perPackageUnitQuantity)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(specifiedLineTradeDeliveryJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}