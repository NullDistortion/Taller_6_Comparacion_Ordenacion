package edu.u2.sorting;

public class SortingUtils {

    //Validar q el arreglo no esta vacio
    public static boolean notEmpty (int[] vec) {
        return vec != null && vec.length > 0;
    }

    // Aqui el copyOf va hacer una copia del arreglo para no modificar el original
    public static int[] copyOf(int[] arr) {
        int[] copia = new int[arr.length];
        System.arraycopy(arr, 0, copia, 0, arr.length);
        return copia;
    }

    //Verificar q el arreglo no este vaio
    public static boolean inEmpty(int[] vec) {
        if (vec.length == 0) {
            System.out.println("Arreglo Vacio\n");
            return true;
        }
        return false;
    }
}