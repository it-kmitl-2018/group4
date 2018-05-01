package com.project.group4.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AddressTest {

    private Address address;

    @Before
    public void setup() {
        address = new Address();
    }

    @Test
    public void AddressNotNullTest() {
        assertNotNull(address);
    }

    @Test
    public void NullTest() {
        assertNull(address.getPostCode());
        assertNull(address.getBuildingName());
        assertNull(address.getBuildingNumber());
        assertNull(address.getAddress());
        assertNull(address.getAlley());
        assertNull(address.getVillage());
        assertNull(address.getStreet());
        assertNull(address.getSubDistrict());
        assertNull(address.getDistrict());
        assertNull(address.getProvince());
        assertNull(address.getCountry());
    }

    @Test
    public void GetterSetterTest() {
        address.setPostCode("4324");
        address.setBuildingName("Building name");
        address.setBuildingNumber("23456755");
        address.setAddress("Address");
        address.setAlley("Alley");
        address.setVillage("Village");
        address.setStreet("Street");
        address.setSubDistrict("SubDistrict");
        address.setDistrict("District");
        address.setProvince("Province");
        address.setCountry("Country");
        
        assertEquals("4324", address.getPostCode());
        assertEquals("Building name", address.getBuildingName());
        assertEquals("23456755", address.getBuildingNumber());
        assertEquals("Address", address.getAddress());
        assertEquals("Alley", address.getAlley());
        assertEquals("Village", address.getVillage());
        assertEquals("Street", address.getStreet());
        assertEquals("SubDistrict", address.getSubDistrict());
        assertEquals("District", address.getDistrict());
        assertEquals("Province", address.getProvince());
        assertEquals("Country", address.getCountry());
    }
}
