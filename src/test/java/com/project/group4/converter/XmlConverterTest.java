package com.project.group4.converter;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.junit.Test;

import static org.junit.Assert.*;

public class XmlConverterTest {

    private class TestXml {

        @JacksonXmlProperty(localName = "id")
        private int id = 0;

        @JacksonXmlProperty(localName = "name")
        private String name = "hello";
    }

    private String xmlString = "<TestXml><id>0</id><name>hello</name></TestXml>";

    @Test
    public void crateJsonStringTest() {
        assertEquals(xmlString, XmlConverter.crateXmlString(new TestXml()));
    }

    @Test
    public void crateJsonFileTest() {
        assertTrue(XmlConverter.crateXmlFile(new TestXml(), "testXml"));
    }
}