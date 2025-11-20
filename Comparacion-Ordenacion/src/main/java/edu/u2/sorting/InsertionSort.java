package edu.u2.sorting;

import java.util.Arrays;

// Aqui solo tomara el arreglo de donde esta y lo va a ordenar en la posicion que debe estar
public final class InsertionSort {

    public static void sort(int[] vector, boolean show) {

        if (!SortingUtils.notEmpty(vector)) {
            System.out.println("Vector vacio...");
        } else {

            System.out.println("Insertion sort");
            System.out.println("Arreglo inical: "+Arrays.toString(vector)+"\n");

            for (int i = 1; i < vector.length; i++) {

                int currentNumber = vector[i];
                int j = i - 1;

                System.out.println("Traza: " + i);
                if (show) {
                    System.out.println(Arrays.toString(vector));
                    System.out.println("Cambiando la pos de  " + currentNumber);
                }

                // Aqui movemos los números que son mayores hacia la derecha
                while (j >= 0 && vector[j] > currentNumber) {
                    vector[j + 1] = vector[j];
                    j--;
                }

                // Aqui solo va hacer para ordenarlo donde va a quedar el numero
                vector[j + 1] = currentNumber;

                if (show) {
                    System.out.print("Estado del vector: ");
                    System.out.println(Arrays.toString(vector)+"\n");
                }

            }
        }

    }
}