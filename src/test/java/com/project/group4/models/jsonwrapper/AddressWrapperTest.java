package com.project.group4.models.jsonwrapper;

import com.project.group4.converter.JsonConverter;
import com.project.group4.models.Address;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressWrapperTest {

    private String postCode = "10600";
    private String buildingName = "สำนักงานใหญ่";
    private String buildingNumber = "313/1";
    private String alley = "";
    private String village = "";
    private String street = "ถนนรัชดาภิเษก";
    private String subDistrict = "บุคโล";
    private String district = "ธนบุรี";
    private String province = "กรุงเทพมหานคร";
    private String country = "TH";
    private Address addressInterpreter;

    @Test
    public void getAllInfo() {
        addressInterpreter = Address.builder()
                .postCode(this.postCode)
                .buildingName(this.buildingName)
                .buildingNumber(this.buildingNumber)
                .alley(this.alley)
                .village(this.village)
                .street(this.street)
                .subDistrict(this.subDistrict)
                .district(this.district)
                .province(this.province)
                .country(this.country)
                .build();
        AddressWrapper addressWrapper = new AddressWrapper(addressInterpreter);

        assertEquals(this.addressInterpreter, addressWrapper.address);
    }

    @Test
    public void getJsonString() {
        addressInterpreter = Address.builder()
                .postCode(this.postCode)
                .buildingName(this.buildingName)
                .buildingNumber(this.buildingNumber)
                .alley(this.alley)
                .village(this.village)
                .street(this.street)
                .subDistrict(this.subDistrict)
                .district(this.district)
                .province(this.province)
                .country(this.country)
                .build();
        AddressWrapper addressWrapper = new AddressWrapper(addressInterpreter);

        assertEquals("{\n" +
                "    \"line_one\" : \"สำนักงานใหญ่ 313/1\",\n" +
                "    \"line_two\" : \"ถนนรัชดาภิเษก บุคโล ธนบุรี กรุงเทพมหานคร 10600\",\n" +
                "    \"city_name\" : \"ธนบุรี\",\n" +
                "    \"city_sub_division_name\" : \"บุคโล\",\n" +
                "    \"post_code\" : \"10600\",\n" +
                "    \"country_sub_division\" : \"กรุงเทพมหานคร\",\n" +
                "    \"country_name\" : \"TH\"\n" +
                "}", JsonConverter.crateJsonString(addressWrapper.getJsonObject()));
    }
}
