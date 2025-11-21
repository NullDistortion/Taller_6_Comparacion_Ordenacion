package edu.u2.main;

import edu.u2.service.CsvLoader;
import edu.u2.service.ResourceScanner;
import edu.u2.tables.Benchmark;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========= MENU PRINCIPAL =========");
            System.out.println("1. Citas");
            System.out.println("2. Inventario");
            System.out.println("3. Pacientes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            int op = safeIntInput(sc);

            if (op == 0) {
                System.out.println("Fin del programa.");
                break;
            }

            String type = "";

            switch (op) {
                case 1:
                    type = "citas";
                    break;

                case 2:
                    type = "inventario";
                    break;

                case 3:
                    type = "pacientes";
                    break;

                default:
                    System.out.println("Opción inválida.");
                    continue;
            }
            
            List<String> files = ResourceScanner.listCsvFiles();

            if (files.isEmpty()) {
                System.out.println("No se encontraron archivos CSV en /resources.");
                continue;
            }

            System.out.println("\nArchivos disponibles:");
            for (int i = 0; i < files.size(); i++) {
                System.out.println((i + 1) + ". " + files.get(i));
            }

            System.out.print("\nSeleccione archivo: ");
            int fileOp = safeIntInput(sc);

            if (fileOp < 1 || fileOp > files.size()) {
                System.out.println("Opción inválida.");
                continue;
            }

            String fileName = files.get(fileOp - 1);

            List<?> list = CsvLoader.loadFromResources(fileName, type);
            int[] keys = CsvLoader.extractKeys(list);

            Benchmark.runAll(keys);
        }
    }

    private static int safeIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
