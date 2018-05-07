package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class TradeContactJson {

    @JsonProperty("person_name")
    public String personName;

    @JsonProperty("department_name")
    public String departmentName;

    @JsonProperty("uriid")
    public String uriId;

    @JsonProperty("complete_number")
    public String telephoneNumber;
}
