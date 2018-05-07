package com.project.group4.models.wrapper;

import com.project.group4.models.IncludedNote;
import com.project.group4.models.interpreter.ExchangedDocumentInterpreter;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentWrapperTest {

    private String id;
    private String name;
    private String typeCode;
    private Date issueDateTime;
    private String purpose;
    private String purposeCode;
    private String globalId;
    private Date creationDateTime;
    private IncludedNote includedNote;
    private ExchangedDocumentInterpreter exchangedDocumentInterpreter;

    @Before
    public void setup() {
        id = "id";
        name = "name";
        typeCode = "typecode";
        purpose = "purpose";
        purposeCode = "purposeCode";
        globalId = "globalId";
    }

//    @Test
//    public void shouldGetAllInfo() {
//        this.exchangedDocumentInterpreter = ExchangedDocumentInterpreter.builder()
//                .id(this.id)
//                .name(this.name)
//                .typeCode(this.typeCode)
//                .issueDateTime(issueDateTime)
//                .purpose(this.purpose)
//                .purposeCode(this.purposeCode)
//                .globalId(this.globalId)
//                .creationDateTime(this.creationDateTime)
//                .includedNote(this.includedNote)
//                .build();
//
//        ExchangedDocumentWrapper.getModelClass(exchangedDocumentInterpreter, null);
//        ExchangedDocumentWrapper exchangedDocumentWrapper = new ExchangedDocumentWrapper();
//        assertEquals(this.exchangedDocumentInterpreter, exchangedDocumentWrapper);
//    }
}