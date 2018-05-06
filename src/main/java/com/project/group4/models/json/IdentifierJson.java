package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class IdentifierJson {

    @JsonProperty("id")
    private String id;
}
