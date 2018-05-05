package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class DesignatedProductJson {

    @JsonProperty("class_code")
    public String classCode;

    @JsonProperty("class_name")
    public String className;
}
