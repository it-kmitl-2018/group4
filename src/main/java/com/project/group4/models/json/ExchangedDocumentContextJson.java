package com.project.group4.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class ExchangedDocumentContextJson {

    @JsonProperty("guideline_specified_document_context_parameter")
    public IdentifierJson identifierJson;
}
