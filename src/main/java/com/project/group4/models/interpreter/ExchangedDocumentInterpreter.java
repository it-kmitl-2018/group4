package com.project.group4.models.interpreter;

import com.project.group4.models.IncludedNote;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Builder
public @Data class ExchangedDocumentInterpreter {

    private String id;
    private String name;
    private String typeCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date issueDateTime;
    private String purpose;
    private String purposeCode;
    private String globalId;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date creationDateTime;
    private IncludedNote includedNote;
}
