package com.project.group4.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncludedNoteTests {

    private IncludedNote includedNote;

    @Before
    public void setup() {
        includedNote = new IncludedNote();
    }

    @Test
    public void includedNoteNotNullTest() {
        assertNotNull(includedNote);
    }

    @Test
    public void NullTest() {
        assertNull(includedNote.getSubject());
        assertNull(includedNote.getContent());
    }

    @Test
    public void GetterSetterTest() {
        includedNote.setSubject("subject");
        includedNote.setContent("content");

        assertEquals("subject", includedNote.getSubject());
        assertEquals("content", includedNote.getContent());
    }
}