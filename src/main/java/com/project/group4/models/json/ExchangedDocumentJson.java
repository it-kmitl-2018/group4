package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class ExchangedDocumentJson {

    @JsonProperty("id")
    public String id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("type_code")
    public String typeCode;

    @JsonProperty("issue_date_time")
    public String issueDateTime;

    @JsonProperty("purpose")
    public String purpose;

    @JsonProperty("purpose_code")
    public String purposeCode;

    @JsonProperty("global_id")
    public String globalId;

    @JsonProperty("creation_date_time")
    public String creationDateTime;

    @JsonProperty("included_note")
    public IncludedNoteJson includedNoteJson;
}
