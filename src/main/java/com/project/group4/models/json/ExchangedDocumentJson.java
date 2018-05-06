package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
public @Data class ExchangedDocumentJson {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type_code")
    private String typeCode;

    @JsonProperty("issue_date_time")
    private String issueDateTime;

    @JsonProperty("purpose")
    private String purpose;

    @JsonProperty("purpose_code")
    private String purposeCode;

    @JsonProperty("global_id")
    private String globalId;

    @JsonProperty("creation_date_time")
    private String creationDateTime;

    @JsonProperty("included_note")
    private IncludedNoteJson includedNoteJson;
}
