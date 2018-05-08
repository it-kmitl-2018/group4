package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressJsonTest {

    private String postcodeCode;
    private String buildingName;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String lineFive;
    private String streetName;
    private String cityName;
    private String citySubDivisionName;
    private String countryId;
    private String countrySubDivisionId;
    private String buildingNumber;

    @Before
    public void setup() {
        postcodeCode = "postcode";
        buildingName = "buildingName";
        lineOne = "lineOne";
        lineTwo = "lineTwo";
        lineThree = "lineThree";
        lineFour = "lineFour";
        lineFive = "lineFive";
        streetName = "streetName";
        cityName = "cityName";
        citySubDivisionName = "citySubDivisionName";
        countryId = "countryId";
        countrySubDivisionId = "countrySubDivisionId";
        buildingNumber = "buildingNumber";
    }

    @Test
    public void buildTest() {
        AddressJson addressJson = AddressJson.builder()
                .postcodeCode(this.postcodeCode)
                .buildingName(this.buildingName)
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .lineThree(this.lineThree)
                .lineFour(this.lineFour)
                .lineFive(this.lineFive)
                .streetName(this.streetName)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countryId(this.countryId)
                .countrySubDivisionId(this.countrySubDivisionId)
                .buildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postcodeCode, addressJson.postcodeCode);
        assertEquals(this.buildingName, addressJson.buildingName);
        assertEquals(this.lineOne, addressJson.lineOne);
        assertEquals(this.lineTwo, addressJson.lineTwo);
        assertEquals(this.lineThree, addressJson.lineThree);
        assertEquals(this.lineFour, addressJson.lineFour);
        assertEquals(this.lineFive, addressJson.lineFive);
        assertEquals(this.streetName, addressJson.streetName);
        assertEquals(this.cityName, addressJson.cityName);
        assertEquals(this.citySubDivisionName, addressJson.citySubDivisionName);
        assertEquals(this.countryId, addressJson.countryId);
        assertEquals(this.countrySubDivisionId, addressJson.countrySubDivisionId);
        assertEquals(this.buildingNumber, addressJson.buildingNumber);
    }

    @Test
    public void jsonStringTest() {
        AddressJson addressJson = AddressJson.builder()
                .postcodeCode(this.postcodeCode)
                .buildingName(this.buildingName)
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .lineThree(this.lineThree)
                .lineFour(this.lineFour)
                .lineFive(this.lineFive)
                .streetName(this.streetName)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countryId(this.countryId)
                .countrySubDivisionId(this.countrySubDivisionId)
                .buildingNumber(this.buildingNumber)
                .build();

        String expectedJson = "{\n" +
                "    \"postcode_code\" : \"postcode\",\n" +
                "    \"building_name\" : \"buildingName\",\n" +
                "    \"line_one\" : \"lineOne\",\n" +
                "    \"line_two\" : \"lineTwo\",\n" +
                "    \"line_three\" : \"lineThree\",\n" +
                "    \"line_four\" : \"lineFour\",\n" +
                "    \"line_five\" : \"lineFive\",\n" +
                "    \"street_name\" : \"streetName\",\n" +
                "    \"city_name\" : \"cityName\",\n" +
                "    \"city_sub_division_name\" : \"citySubDivisionName\",\n" +
                "    \"country_id\" : \"countryId\",\n" +
                "    \"country_sub_division_id\" : \"countrySubDivisionId\",\n" +
                "    \"building_number\" : \"buildingNumber\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(addressJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        AddressJson addressJson = AddressJson.builder()
                .postcodeCode(this.postcodeCode)
                .buildingName(this.buildingName)
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .lineThree(this.lineThree)
                .lineFour(this.lineFour)
                .lineFive(this.lineFive)
                .streetName(this.streetName)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countryId(this.countryId)
                .countrySubDivisionId(this.countrySubDivisionId)
                .buildingNumber(this.buildingNumber)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(addressJson, "test");

        assertEquals(expectedBool, actualBool);

    }
}
