package edu.u2.sorting;

public class SortingUtils {

    public static boolean notEmpty(int[] arr) {
        return arr != null && arr.length > 0;
    }

    public static int[] copyOf(int[] arr) {
        int[] clone = new int[arr.length];
        System.arraycopy(arr, 0, clone, 0, arr.length);
        return clone;
    }
}
