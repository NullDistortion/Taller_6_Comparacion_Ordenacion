package edu.u2.sorting;

public final class InsertionSort {

    public static int comparisons = 0;
    public static int swaps = 0;

    public static void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public static void sort(int[] arr) {
        if (!SortingUtils.notEmpty(arr)) return;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    swaps++;
                    j--;
                } else break;
            }

            arr[j + 1] = key;
        }
    }
}
