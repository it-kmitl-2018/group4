package model.seller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    private Address address;

    @Before
    public void setup() {
        address = new Address();
    }

    @Test
    public void addressNotNull() {
        assertNotNull(address);
    }

    @Test
    public void postCodeNullTest() {
        assertNull(address.getPostCode());
    }

    @Test
    public void postCodeGetSetTest() {
        address.setPostCode("10520");
        assertEquals("10520", address.getPostCode());
    }

    @Test
    public void buildingNameNullTest() {
        assertNull(address.getBuildingName());
    }

    @Test
    public void buildingNameGetSetTest() {
        address.setBuildingName("BuildingName");
        assertEquals("BuildingName", address.getBuildingName());
    }

    @Test
    public void buildingNumberNullTest() {
        assertNull(address.getBuildingNumber());
    }

    @Test
    public void buildingNumberGetSetTest() {
        address.setBuildingNumber("789456123");
        assertEquals("789456123", address.getBuildingNumber());
    }

    @Test
    public void addressNullTest() {
        assertNull(address.getAddress());
    }

    @Test
    public void addressGetSetTest() {
        address.setAddress("Address");
        assertEquals("Address", address.getAddress());
    }

    @Test
    public void alleyNullTest() {
        assertNull(address.getAlley());
    }

    @Test
    public void alleyGetSetTest() {
        address.setAlley("Alley");
        assertEquals("Alley", address.getAlley());
    }

    @Test
    public void villageNullTest() {
        assertNull(address.getVillage());
    }

    @Test
    public void villageGetSetTest() {
        address.setVillage("Village");
        assertEquals("Village", address.getVillage());
    }

    @Test
    public void streetNullTest() {
        assertNull(address.getStreet());
    }

    @Test
    public void streetGetSetTest() {
        address.setStreet("Street");
        assertEquals("Street", address.getStreet());
    }

    @Test
    public void subDistrictNullTest() {
        assertNull(address.getSubDistrict());
    }

    @Test
    public void subDistrictGetSetTest() {
        address.setSubDistrict("SubDistrict");
        assertEquals("SubDistrict", address.getSubDistrict());
    }

    @Test
    public void districtNullTest() {
        assertNull(address.getDistrict());
    }

    @Test
    public void districtGetSetTest() {
        address.setDistrict("District");
        assertEquals("District", address.getDistrict());
    }

    @Test
    public void provinceNullTest() {
        assertNull(address.getProvince());
    }

    @Test
    public void provinceGetSetTest() {
        address.setProvince("Province");
        assertEquals("Province", address.getProvince());
    }

    @Test
    public void countryNullTest() {
        assertNull(address.getCountry());
    }

    @Test
    public void countryGetSetTest() {
        address.setCountry("Country");
        assertEquals("Country", address.getCountry()    );
    }
}