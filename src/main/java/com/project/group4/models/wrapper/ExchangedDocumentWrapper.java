package com.project.group4.models.wrapper;

import com.project.group4.models.IncludedNote;
import com.project.group4.models.interpreter.ExchangedDocumentInterpreter;
import com.project.group4.models.json.ExchangedDocumentJson;

public class ExchangedDocumentWrapper {

    public static ExchangedDocumentJson getModelClass(ExchangedDocumentInterpreter exchangedDocumentInterpreter, IncludedNote includedNote) {
        ExchangedDocumentJson exchangedDocumentJson = ExchangedDocumentJson.builder()
                .id(exchangedDocumentInterpreter.getId())
                .name(exchangedDocumentInterpreter.getName())
                .typeCode(exchangedDocumentInterpreter.getTypeCode())
                .issueDateTime(exchangedDocumentInterpreter.getIssueDateTime().toString())
                .purpose(exchangedDocumentInterpreter.getPurpose())
                .purposeCode(exchangedDocumentInterpreter.getPurposeCode())
                .globalId(exchangedDocumentInterpreter.getGlobalId())
                .creationDateTime(exchangedDocumentInterpreter.getCreationDateTime().toString())
                .includedNoteJson(IncludedNoteWrapper.getModelClass(includedNote))
                .build();

        return exchangedDocumentJson;
    }
}
