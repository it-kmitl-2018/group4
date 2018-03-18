package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelephoneUniversalCommunicationTest {

    private TelephoneUniversalCommunication telephoneUniversalCommunication;

    @Before
    public void setup() {
        telephoneUniversalCommunication = new TelephoneUniversalCommunication();
    }

    @Test
    public void telephoneUniversalCommunicationNotNullTest() {
        assertNotNull(telephoneUniversalCommunication);
    }

    @Test
    public void phoneNumberNullTest() {
        assertNull(telephoneUniversalCommunication.getPhoneNumber());
    }

    @Test
    public void phoneNumberGetSetTest() {
        telephoneUniversalCommunication.setPhoneNumber("0888888888");
        assertEquals("0888888888", telephoneUniversalCommunication.getPhoneNumber());
    }
}