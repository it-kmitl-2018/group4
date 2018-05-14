package com.project.group4.converter;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XmlConverter {

    private static XmlMapper mapper;

    static {
        mapper = new XmlMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static String crateXmlString(Object model) {
        try {
            return mapper.writeValueAsString(model);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean crateXmlFile(Object model, String filename) {
        try {
            mapper.writeValue(new FileOutputStream( filename + ".xml" ), model );
            return true;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
