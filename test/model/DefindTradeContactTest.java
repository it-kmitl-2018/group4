package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DefindTradeContactTest {

    private DefindTradeContact defindTradeContact;

    @Before
    public void setup() {
        defindTradeContact = new DefindTradeContact();
    }

    @Test
    public void defindTradeContactNotNullTest() {
        assertNotNull(defindTradeContact);
    }

    @Test
    public void personNameNullTest() {
        assertNull(defindTradeContact.getPersonName());
    }

    @Test
    public void personNameGetSetTest() {
        defindTradeContact.setPersonName("ผืนดิน ยืนยิ้ม");
        assertEquals("ผืนดิน ยืนยิ้ม", defindTradeContact.getPersonName());
    }

    @Test
    public void departmentNameNullTest() {
        assertNull(defindTradeContact.getDepartmentName());
    }

    @Test
    public void departmentNameGetSetTest() {
        defindTradeContact.setDepartmentName("แผนกการเงิน");
        assertEquals("แผนกการเงิน", defindTradeContact.getDepartmentName());
    }
}