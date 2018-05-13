package com.project.group4.models.json;

import com.project.group4.converter.JsonConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressJsonTest {

    private String postcodeCode;
    private String lineOne;
    private String lineTwo;
    private String cityName;
    private String citySubDivisionName;
    private String countrySubDivisionName;
    private String buildingNumber;

    @Before
    public void setup() {
        postcodeCode = "10600";
        lineOne = "สำนักงานใหญ่ เลขที่313/1";
        lineTwo = "ถนนรัชดาภิเษก แขวงบุคโล เขตธนบุรี กรุงเทพมหานคร 10600";
        cityName = "ธนบุรี";
        citySubDivisionName = "บุคโล";
        countrySubDivisionName = "กรุงเทพมหานคร";
        buildingNumber = "TH";
    }

    @Test
    public void buildTest() {
        AddressJson addressJson= AddressJson.builder()
                .postcode(this.postcodeCode)
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countrySubDivisionId(this.countrySubDivisionName)
                .buildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postcodeCode, addressJson.postcode);
        assertEquals(this.lineOne, addressJson.lineOne);
        assertEquals(this.lineTwo, addressJson.lineTwo);
        assertEquals(this.cityName, addressJson.cityName);
        assertEquals(this.citySubDivisionName, addressJson.citySubDivisionName);
        assertEquals(this.countrySubDivisionName, addressJson.countrySubDivisionId);
        assertEquals(this.buildingNumber, addressJson.buildingNumber);
    }

    @Test
    public void jsonStringTest() {
        AddressJson addressJson = AddressJson.builder()
                .postcode(this.postcodeCode)
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countrySubDivisionId(this.countrySubDivisionName)
                .buildingNumber(this.buildingNumber)
                .build();

        String expectedJson = "{\n" +
                "    \"line_one\" : \"สำนักงานใหญ่ เลขที่313/1\",\n" +
                "    \"line_two\" : \"ถนนรัชดาภิเษก แขวงบุคโล เขตธนบุรี กรุงเทพมหานคร 10600\",\n" +
                "    \"city_name\" : \"ธนบุรี\",\n" +
                "    \"city_sub_division_name\" : \"บุคโล\",\n" +
                "    \"post_code\" : \"10600\",\n" +
                "    \"country_sub_division\" : \"กรุงเทพมหานคร\",\n" +
                "    \"country_name\" : \"TH\"\n" +
                "}";
        String actualJson = JsonConverter.crateJsonString(addressJson);

        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void jsonFileTest() {
        AddressJson addressJson = AddressJson.builder()
                .postcode(this.postcodeCode)
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countrySubDivisionId(this.countrySubDivisionName)
                .buildingNumber(this.buildingNumber)
                .build();

        Boolean expectedBool = true;
        Boolean actualBool = JsonConverter.crateJsonFile(addressJson, "test");

        assertEquals(expectedBool, actualBool);
    }
}
