package com.project.group4.models.wrapper;

import com.project.group4.models.IncludedNote;
import com.project.group4.models.json.IncludedNoteJson;

public class IncludedNoteWrapper {

    public static IncludedNoteJson getModelClass(IncludedNote includedNote) {
        IncludedNoteJson includedNoteJson = IncludedNoteJson.builder()
                .subject(includedNote.getSubject())
                .content(includedNote.getContent())
                .build();

        return includedNoteJson;
    }
}
