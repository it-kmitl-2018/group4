package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuidelineSpecifiedDocumentContextParameterTest {

    private GuidelineSpecifiedDocumentContextParameter guidelineSpecifiedDocumentContextParameter;

    @Before
    public void setup() {
        guidelineSpecifiedDocumentContextParameter = new GuidelineSpecifiedDocumentContextParameter();
    }

    @Test
    public void GuidelineSpecifiedDocumentContextParameterNotNullTest() {
        assertNotNull(guidelineSpecifiedDocumentContextParameter);
    }

    @Test
    public void idNullTest() {
        assertNull(guidelineSpecifiedDocumentContextParameter.getId());
    }

    @Test
    public void idGetSetTest() {
        guidelineSpecifiedDocumentContextParameter.setId("ER3-2560");
        assertEquals("ER3-2560", guidelineSpecifiedDocumentContextParameter.getId());
    }
}