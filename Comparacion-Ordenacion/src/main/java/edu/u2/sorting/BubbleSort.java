package edu.u2.sorting;

public final class BubbleSort {

    public static int comparisons = 0;
    public static int swaps = 0;

    public static void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public static void sort(int[] arr) {
        if (!SortingUtils.notEmpty(arr)) return;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            boolean changed = false;

            for (int i = 0; i < arr.length - 1 - pass; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swaps++;
                    int aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    changed = true;
                }
            }

            if (!changed) break;
        }
    }
}
