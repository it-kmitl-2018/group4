package com.project.group4.models.json;

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
}
