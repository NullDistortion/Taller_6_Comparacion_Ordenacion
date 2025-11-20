package edu.u2.sorting;

import java.util.Arrays;

//Aqui se van a comparar de dos en dos y se van a ir arreglando
public final class BubbleSort {

    public static void sort(int[] vector, boolean show) {

        long startTime = System.nanoTime();

        if (!SortingUtils.notEmpty(vector)) {
            System.out.println("Vector vacio...");
        } else {

            System.out.println("Bu");
            System.out.println("Arreglo incial: " + Arrays.toString(vector));

            for (int trace = 0; trace < vector.length - 1; trace++) {

                boolean change = false;

                if (show) {
                    System.out.println("\nTraza " + (trace + 1));
                }

                for (int i = 0; i < vector.length - 1 - trace; i++) {
                    if (vector[i] > vector[i + 1]) {
                        if (show) {
                            System.out.println("Intercambio " + vector[i] +
                                    " con " + vector[i + 1]);
                        }
                        int aux = vector[i];
                        vector[i] = vector[i + 1];
                        vector[i + 1] = aux;

                        change = true;
                    }
                }

                if (show) {
                    System.out.print("Estado del vector: ");
                    System.out.println(Arrays.toString(vector) + "\n");
                }

                if (!change) {
                    if (show) {
                        System.out.println("No hubo cambios");
                    }
                    break;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("El metodo se demoro " + (endTime - startTime) + " nano segundos");

    }
}