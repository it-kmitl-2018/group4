package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicableTradeDeliveryTermsTest {

    private ApplicableTradeDeliveryTerms applicableTradeDeliveryTerms;

    @Before
    public void setup() {
        applicableTradeDeliveryTerms = new ApplicableTradeDeliveryTerms();
    }

    @Test
    public void applicableTradeDeliveryTermsNotNullTest() {
        assertNotNull(applicableTradeDeliveryTerms);
    }

    @Test
    public void subjectNullTest() {
        assertNull(applicableTradeDeliveryTerms.getDeliveryTypeCode());
    }

    @Test
    public void subjectGetSetTest() {
        applicableTradeDeliveryTerms.setDeliveryTypeCode("01");
        assertEquals("01", applicableTradeDeliveryTerms.getDeliveryTypeCode());
    }

}