package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class IncludedNoteJson {

    @JsonProperty("subject")
    public String subject;

    @JsonProperty("content")
    public String content;
}
