package edu.u2.service;

import edu.u2.domain.*;
import java.time.LocalDateTime;
import java.util.*;

public final class CsvLoader {

    public static List<?> loadFromResources(String fileName, String type) {

        List<String[]> rows = CsvFileReader.readFromResources(fileName, ";");

        return parse(type, rows);
    }

    private static List<?> parse(String type, List<String[]> rows) {

        switch (type.toLowerCase()) {

            case "citas":
                List<Appointment> citas = new ArrayList<>();
                for (String[] r : rows) {
                    citas.add(new Appointment(
                            r[0], r[1], LocalDateTime.parse(r[2])
                    ));
                }
                return citas;

            case "inventario":
                List<Input> list = new ArrayList<>();
                for (String[] r : rows) {
                    list.add(new Input(
                            r[0], r[1], Integer.parseInt(r[2])
                    ));
                }
                return list;

            case "pacientes":
                List<Patient> pac = new ArrayList<>();
                for (String[] r : rows) {
                    pac.add(new Patient(
                            r[0], r[1], Integer.parseInt(r[2])
                    ));
                }
                return pac;

            default:
                System.out.println("Tipo desconocido: " + type);
                return new ArrayList<>();
        }
    }

    public static int[] extractKeys(List<?> list) {
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {

            Object obj = list.get(i);

            if (obj instanceof Appointment a)
                arr[i] = a.getKey();

            else if (obj instanceof Input ins)
                arr[i] = ins.getKey();

            else if (obj instanceof Patient p)
                arr[i] = p.getKey();

            else arr[i] = 0;
        }

        return arr;
    }
}
