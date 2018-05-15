package com.project.group4.models.interpreter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AddressInterpreterTest {

    private AddressInterpreter addressInterpreter;

    @Before
    public void setup() {
        addressInterpreter = new AddressInterpreter();
    }

    @Test
    public void AddressNotNullTest() {
        assertNotNull(addressInterpreter);
    }

    @Test
    public void NullTest() {
        assertNull(addressInterpreter.getPostCode());
        assertNull(addressInterpreter.getBuildingName());
        assertNull(addressInterpreter.getBuildingNumber());
        assertNull(addressInterpreter.getAddress());
        assertNull(addressInterpreter.getAlley());
        assertNull(addressInterpreter.getVillage());
        assertNull(addressInterpreter.getStreet());
        assertNull(addressInterpreter.getSubDistrict());
        assertNull(addressInterpreter.getDistrict());
        assertNull(addressInterpreter.getProvince());
        assertNull(addressInterpreter.getCountry());
    }

    @Test
    public void GetterSetterTest() {
        addressInterpreter.setPostCode("4324");
        addressInterpreter.setBuildingName("Building name");
        addressInterpreter.setBuildingNumber("23456755");
        addressInterpreter.setAddress("Address");
        addressInterpreter.setAlley("Alley");
        addressInterpreter.setVillage("Village");
        addressInterpreter.setStreet("Street");
        addressInterpreter.setSubDistrict("SubDistrict");
        addressInterpreter.setDistrict("District");
        addressInterpreter.setProvince("Province");
        addressInterpreter.setCountry("Country");
        
        assertEquals("4324", addressInterpreter.getPostCode());
        assertEquals("Building name", addressInterpreter.getBuildingName());
        assertEquals("23456755", addressInterpreter.getBuildingNumber());
        assertEquals("Address", addressInterpreter.getAddress());
        assertEquals("Alley", addressInterpreter.getAlley());
        assertEquals("Village", addressInterpreter.getVillage());
        assertEquals("Street", addressInterpreter.getStreet());
        assertEquals("SubDistrict", addressInterpreter.getSubDistrict());
        assertEquals("District", addressInterpreter.getDistrict());
        assertEquals("Province", addressInterpreter.getProvince());
        assertEquals("Country", addressInterpreter.getCountry());
    }
}
