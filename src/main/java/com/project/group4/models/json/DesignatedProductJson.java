package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class DesignatedProductJson {

    @JsonProperty("class_code")
    private String classCode;

    @JsonProperty("class_name")
    private String className;
}
