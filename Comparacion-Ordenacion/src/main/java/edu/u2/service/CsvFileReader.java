package edu.u2.service;

import java.io.*;
import java.util.*;

public final class CsvFileReader {

    public static InputStream getResource(String name) {
        return CsvFileReader.class.getClassLoader().getResourceAsStream(name);
    }

    public static List<String[]> readFromResources(String fileName, String sep) {
        List<String[]> rows = new ArrayList<>();

        try (InputStream is = getResource(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;
            boolean first = true;

            while ((line = br.readLine()) != null) {
                if (first) { first = false; continue; }
                rows.add(line.split(sep));
            }

        } catch (Exception e) {
            System.out.println("Error leyendo CSV: " + e.getMessage());
        }

        return rows;
    }
}
