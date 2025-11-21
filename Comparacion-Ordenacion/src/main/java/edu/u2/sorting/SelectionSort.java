package edu.u2.sorting;

public final class SelectionSort {

    public static int comparisons = 0;
    public static int swaps = 0;

    public static void reset() {
        comparisons = 0;
        swaps = 0;
    }

    public static void sort(int[] arr) {
        if (!SortingUtils.notEmpty(arr)) return;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[min])
                    min = j;
            }

            if (min != i) {
                swaps++;
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }
}
