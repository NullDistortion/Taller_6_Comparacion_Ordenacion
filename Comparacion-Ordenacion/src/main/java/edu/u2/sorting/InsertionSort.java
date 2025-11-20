package edu.u2.sorting;

import java.util.Arrays;

// Aqui solo tomara el arreglo de donde esta y lo va a ordenar en la posicion que debe estar
public final class InsertionSort {

    public static void sort(int[] vector, boolean show) {

        for (int i = 1; i < vector.length; i++) {

            int currentNumber = vector[i];
            int j = i - 1;

            if (show) {
                System.out.println("Colocando el número " + currentNumber + " donde debe ir...");
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