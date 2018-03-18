package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailUriUniversalCommunicationTest {

    private EmailUriUniversalCommunication emailUriUniversalCommunication;

    @Before
    public void setup() {
        emailUriUniversalCommunication = new EmailUriUniversalCommunication();
    }

    @Test
    public void emailUriUniversalCommunicationNotNullTest() {
        assertNotNull(emailUriUniversalCommunication);
    }

    @Test
    public void uriIdNullTest() {
        assertNull(emailUriUniversalCommunication.getUriId());
    }

    @Test
    public void uriIdGetSetTest() {
        emailUriUniversalCommunication.setUriId("test@gmail.com");
        assertEquals("test@gmail.com", emailUriUniversalCommunication.getUriId());
    }
}