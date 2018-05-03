package com.project.group4.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class JsonConverter {

    private static ObjectMapper mapper;
    private static DefaultPrettyPrinter.Indenter indenter;
    private static DefaultPrettyPrinter printer;

    static {
        mapper = new ObjectMapper();
        indenter = new DefaultIndenter("    ", "\n");
        printer = new DefaultPrettyPrinter();

        printer.indentObjectsWith(indenter);
        printer.indentArraysWith(indenter);
    }

    public static String crateJsonString(Object model) {
        try {
            return mapper.writer(printer).writeValueAsString(model);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean crateJsonFile(Object model, String filename) {
        try {
            mapper.writeValue(new FileOutputStream(filename + ".json"), model);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
