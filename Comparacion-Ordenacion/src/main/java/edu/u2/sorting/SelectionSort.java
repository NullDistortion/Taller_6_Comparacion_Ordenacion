package edu.u2.sorting;

import java.util.Arrays;

// Aqui debe buscar el numero menor y colocarlo en el inicio
public final class SelectionSort {

    public static void sort(int[] vector, boolean show) {

        System.out.println("Selecion Sort: ");
        System.out.println("Arreglo incial: " + Arrays.toString(vector));

        int changes = 0;

        for (int i = 0; i < vector.length - 1; i++) {

            int minimun = i;

            if (show) {
                System.out.println("Busqueda del numero mas pequeño desde la pocion" + i);
            }

            // Aqui va a buscar el numero menor
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[minimun]) {
                    minimun = j;
                }
            }

            // Aqui es para ver si encuentra un numero mas pequeño lo va a cambiar x ese
            if (minimun != i) {
                if (show) {
                    System.out.println("Intercambiando " + vector[i] + " con " + vector[minimun]);
                }

                int aux = vector[i];
                vector[i] = vector[minimun];
                vector[minimun] = aux;

                changes++;
            }

            if (show) {
                System.out.print("Estado del vector: ");
                System.out.println(Arrays.toString(vector)+"\n");
            }
        }

        //Aqui debo show los changes que se hicieron en todos BUBBLE INSERTION Y SELECTION
        if (show) {
            System.out.println("Los changes que se hizo aqui son: " + changes);
        }
    }
}