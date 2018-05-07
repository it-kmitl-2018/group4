package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class AddressJson {

    @JsonProperty("postcode_code")
    public String postcodeCode;

    @JsonProperty("building_name")
    public String buildingName;

    @JsonProperty("line_one")
    public String lineOne;

    @JsonProperty("line_two")
    public String lineTwo;

    @JsonProperty("line_three")
    public String lineThree;

    @JsonProperty("line_four")
    public String lineFour;

    @JsonProperty("line_five")
    public String lineFive;

    @JsonProperty("street_name")
    public String streetName;

    @JsonProperty("city_name")
    public String cityName;

    @JsonProperty("city_sub_division_name")
    public String citySubDivisionName;

    @JsonProperty("country_id")
    public String countryId;

    @JsonProperty("country_sub_division_id")
    public String countrySubDivisionId;

    @JsonProperty("building_number")
    public String buildingNumber;
}
