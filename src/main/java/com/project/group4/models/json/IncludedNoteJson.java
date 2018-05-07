package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class IncludedNoteJson {

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("content")
    private String content;
}
