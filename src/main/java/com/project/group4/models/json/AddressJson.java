package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class AddressJson {

    @JsonProperty("line_one")
    public String lineOne;

    @JsonProperty("line_two")
    public String lineTwo;

    @JsonProperty("city_name")
    public String cityName;

    @JsonProperty("city_sub_division_name")
    public String citySubDivisionName;

    @JsonProperty("post_code")
    public String postcode;

    @JsonProperty("country_sub_division")
    public String countrySubDivisionId;

    @JsonProperty("country_name")
    public String buildingNumber;
}
