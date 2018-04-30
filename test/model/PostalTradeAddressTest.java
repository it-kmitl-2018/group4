package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostalTradeAddressTest {

    private PostalTradeAddress postalTradeAddress;

    @Before
    public void setup() {
        postalTradeAddress = new PostalTradeAddress();
    }

    @Test
    public void postalTradeAddressNotNullTest() {
        assertNotNull(postalTradeAddress);
    }

    @Test
    public void postCodeNullTest() {
        assertNull(postalTradeAddress.getPostCode());
    }

    @Test
    public void postCodeGetSetTest() {
        postalTradeAddress.setPostCode("10330");
        assertEquals("10330", postalTradeAddress.getPostCode());
    }

    @Test
    public void buildingNameNullTest() {
        assertNull(postalTradeAddress.getBuildingName());
    }

    @Test
    public void buildingNameGetSetTest() {
        postalTradeAddress.setBuildingName("อาคารธารา");
        assertEquals("อาคารธารา", postalTradeAddress.getBuildingName());
    }

    @Test
    public void line1NullTest() {
        assertNull(postalTradeAddress.getLine1());
    }

    @Test
    public void line1GetSetTest() {
        postalTradeAddress.setLine1("จุฬาซอย 10");
        assertEquals("จุฬาซอย 10", postalTradeAddress.getLine1());
    }

    @Test
    public void line2NullTest() {
        assertNull(postalTradeAddress.getLine2());
    }

    @Test
    public void line2GetSetTest() {
        postalTradeAddress.setLine2("จุฬาซอย 10");
        assertEquals("จุฬาซอย 10", postalTradeAddress.getLine2());
    }

    @Test
    public void line3NullTest() {
        assertNull(postalTradeAddress.getLine3());
    }

    @Test
    public void line3GetSetTest() {
        postalTradeAddress.setLine3("จุฬาซอย 10");
        assertEquals("จุฬาซอย 10", postalTradeAddress.getLine3());
    }

    @Test
    public void line4NullTest() {
        assertNull(postalTradeAddress.getLine4());
    }

    @Test
    public void line4GetSetTest() {
        postalTradeAddress.setLine4("จุฬาซอย 10");
        assertEquals("จุฬาซอย 10", postalTradeAddress.getLine4());
    }

    @Test
    public void line5NullTest() {
        assertNull(postalTradeAddress.getLine5());
    }

    @Test
    public void line5GetSetTest() {
        postalTradeAddress.setLine5("จุฬาซอย 10");
        assertEquals("จุฬาซอย 10", postalTradeAddress.getLine5());
    }

    @Test
    public void streetNameNullTest() {
        assertNull(postalTradeAddress.getStreetName());
    }

    @Test
    public void streetNameGetSetTest() {
        postalTradeAddress.setStreetName("พระราม 6");
        assertEquals("พระราม 6", postalTradeAddress.getStreetName());
    }

    @Test
    public void cityNameNullTest() {
        assertNull(postalTradeAddress.getCityName());
    }

    @Test
    public void cityNameGetSetTest() {
        postalTradeAddress.setCityName("1004");
        assertEquals("1004", postalTradeAddress.getCityName());
    }

    @Test
    public void citySubDivisionIdNullTest() {
        assertNull(postalTradeAddress.getCitySubDivisionId());
    }

    @Test
    public void citySubDivisionIdGetSetTest() {
        postalTradeAddress.setCitySubDivisionId("100402");
        assertEquals("100402", postalTradeAddress.getCitySubDivisionId());
    }

    @Test
    public void countryIdNullTest() {
        assertNull(postalTradeAddress.getCountryId());
    }

    @Test
    public void countryIdGetSetTest() {
        postalTradeAddress.setCountryId("TH");
        assertEquals("TH", postalTradeAddress.getCountryId());
    }

    @Test
    public void countrySubDivisionIdNullTest() {
        assertNull(postalTradeAddress.getCountrySubDivisionId());
    }

    @Test
    public void countrySubDivisionIdGetSetTest() {
        postalTradeAddress.setCountrySubDivisionId("02");
        assertEquals("02", postalTradeAddress.getCountrySubDivisionId());
    }

    @Test
    public void buildingNumberNullTest() {
        assertNull(postalTradeAddress.getBuildingNumber());
    }

    @Test
    public void buildingNumberGetSetTest() {
        postalTradeAddress.setBuildingNumber("799/89");
        assertEquals("799/89", postalTradeAddress.getBuildingNumber());
    }
}