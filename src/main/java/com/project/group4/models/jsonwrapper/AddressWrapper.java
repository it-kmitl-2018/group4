package com.project.group4.models.jsonwrapper;

import com.project.group4.models.Address;
import com.project.group4.models.json.AddressJson;

public class AddressWrapper {

    public Address address;

    public AddressWrapper(Address address) {
        this.address = address;
    }

    public AddressJson getJsonObject() {
        AddressJson addressJson = AddressJson.builder()
                .lineOne(getLineDetail(1,
                        this.address.getBuildingName(),
                        this.address.getBuildingNumber(),
                        this.address.getStreet(),
                        this.address.getDistrict(),
                        this.address.getSubDistrict(),
                        this.address.getProvince(),
                        this.address.getPostCode()))
                .lineTwo(getLineDetail(2,
                        this.address.getBuildingName(),
                        this.address.getBuildingNumber(),
                        this.address.getStreet(),
                        this.address.getDistrict(),
                        this.address.getSubDistrict(),
                        this.address.getProvince(),
                        this.address.getPostCode()))
                .cityName(this.address.getDistrict())
                .citySubDivisionName(this.address.getSubDistrict())
                .postcode(this.address.getPostCode())
                .countrySubDivisionId(this.address.getProvince())
                .countryName(this.address.getCountry())
                .build();

        return addressJson;
    }

    private String getLineDetail(int line,
                                 String buildingName,
                                 String buildingNumber,
                                 String street,
                                 String district,
                                 String subDistrict,
                                 String province,
                                 String postcode) {
        String lineDetail = "";
        if(line == 1) {
            lineDetail = buildingName + " " + buildingNumber;
        }
        else if(line == 2) {
            lineDetail = street + " " + subDistrict + " " + district + " " + province + " " + postcode;
        }

        return lineDetail;
    }
}
