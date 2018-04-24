package taxinvoice.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncludedNoteTest {

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
    public void subjectNullTest() {
        assertNull(includedNote.getSubject());
    }

    @Test
    public void subjectGetSetTest() {
        includedNote.setSubject("หมายเหตุ");
        assertEquals("หมายเหตุ", includedNote.getSubject());
    }

    @Test
    public void contentNullTest() {
        assertNull(includedNote.getContent());
    }

    @Test
    public void contentGetSetTest() {
        includedNote.setContent("ใช้ในงานราชการเท่านั้น");
        assertEquals("ใช้ในงานราชการเท่านั้น", includedNote.getContent());
    }
}