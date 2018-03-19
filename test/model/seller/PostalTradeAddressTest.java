package model.seller;

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
    public void postalTradeAddressNotNull() {
        assertNotNull(postalTradeAddress);
    }

    @Test
    public void postCodeNullTest() {
        assertNull(postalTradeAddress.getPostCode());
    }

    @Test
    public void postCodeGetSetTest() {
        postalTradeAddress.setPostCode("10520");
        assertEquals("10520", postalTradeAddress.getPostCode());
    }

    @Test
    public void buildingNameNullTest() {
        assertNull(postalTradeAddress.getBuildingName());
    }

    @Test
    public void buildingNameGetSetTest() {
        postalTradeAddress.setBuildingName("BuildingName");
        assertEquals("BuildingName", postalTradeAddress.getBuildingName());
    }

    @Test
    public void buildingNumberNullTest() {
        assertNull(postalTradeAddress.getBuildingNumber());
    }

    @Test
    public void buildingNumberGetSetTest() {
        postalTradeAddress.setBuildingNumber("789456123");
        assertEquals("789456123", postalTradeAddress.getBuildingNumber());
    }

    @Test
    public void addressNullTest() {
        assertNull(postalTradeAddress.getAddress());
    }

    @Test
    public void addressGetSetTest() {
        postalTradeAddress.setAddress("Address");
        assertEquals("Address", postalTradeAddress.getAddress());
    }

    @Test
    public void alleyNullTest() {
        assertNull(postalTradeAddress.getAlley());
    }

    @Test
    public void alleyGetSetTest() {
        postalTradeAddress.setAlley("Alley");
        assertEquals("Alley", postalTradeAddress.getAlley());
    }

    @Test
    public void villageNameNullTest() {
        assertNull(postalTradeAddress.getVillageName());
    }

    @Test
    public void villageNameGetSetTest() {
        postalTradeAddress.setVillageName("village");
        assertEquals("village", postalTradeAddress.getVillageName());
    }

    @Test
    public void villageNumberNullTest() {
        assertNull(postalTradeAddress.getVillageNumber());
    }

    @Test
    public void villageNumberGetSetTest() {
        postalTradeAddress.setVillageNumber("321654987");
        assertEquals("321654987", postalTradeAddress.getVillageNumber());
    }

    @Test
    public void streetNameNullTest() {
        assertNull(postalTradeAddress.getStreetName());
    }

    @Test
    public void streetNameGetSetTest() {
        postalTradeAddress.setStreetName("Street");
        assertEquals("Street", postalTradeAddress.getStreetName());
    }

    @Test
    public void cityNameNullTest() {
        assertNull(postalTradeAddress.getCityName());
    }

    @Test
    public void cityNameGetSetTest() {
        postalTradeAddress.setCityName("City");
        assertEquals("City", postalTradeAddress.getCityName());
    }

    @Test
    public void citySubDivisionNameNullTest() {
        assertNull(postalTradeAddress.getCitySubDivisionName());
    }

    @Test
    public void citySubDivisionNameGetSetTest() {
        postalTradeAddress.setCitySubDivisionName("CitySubDivision");
        assertEquals("CitySubDivision", postalTradeAddress.getCitySubDivisionName());
    }

    @Test
    public void countryIdNullTest() {
        assertNull(postalTradeAddress.getCountryId());
    }

    @Test
    public void countryIdGetSetTest() {
        postalTradeAddress.setCountryId("123");
        assertEquals("123", postalTradeAddress.getCountryId());
    }

    @Test
    public void countrySubDivisionIdNullTest() {
        assertNull(postalTradeAddress.getCountrySubDivisionId());
    }

    @Test
    public void countrySubDivisionIdGetSetTest() {
        postalTradeAddress.setCountrySubDivisionId("456");
        assertEquals("456", postalTradeAddress.getCountrySubDivisionId());
    }
}