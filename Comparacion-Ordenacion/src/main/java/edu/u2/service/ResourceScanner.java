package edu.u2.service;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class ResourceScanner {

    public static List<String> listCsvFiles() {
        List<String> fileNames = new ArrayList<>();

        URL url = ResourceScanner.class.getClassLoader().getResource("");
        if (url == null) {
            System.out.println("No se pudo acceder a /resources.");
            return fileNames;
        }

        File folder = new File(url.getPath());
        File[] files = folder.listFiles();

        if (files == null) return fileNames;

        for (File f : files) {
            if (f.getName().endsWith(".csv")) {
                fileNames.add(f.getName());
            }
        }

        return fileNames;
    }
}
