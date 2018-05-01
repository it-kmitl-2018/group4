package com.project.group4.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class JsonConverter {

    private static ObjectWriter ow;

    static {
        ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    }

    public static String crateJsonString(Object model) {
        try {
            return ow.writeValueAsString(model);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean crateJsonFile(Object model, String filename) {
        try {
            ow.writeValue(new FileOutputStream(filename + ".json"), model);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
