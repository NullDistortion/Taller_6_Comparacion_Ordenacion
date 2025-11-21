package edu.u2.tables;

import edu.u2.sorting.*;
import java.util.Arrays;

public class Benchmark {

    private static long median(long[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static void runAll(int[] original) {

        System.out.println("\nResultado");

        benchmark("BubbleSort", BubbleSort::sort, BubbleSort::reset, original);
        benchmark("SelectionSort", SelectionSort::sort, SelectionSort::reset, original);
        benchmark("InsertionSort", InsertionSort::sort, InsertionSort::reset, original);
    }

    private static void benchmark(String name,
                                  java.util.function.Consumer<int[]> algorithm,
                                  Runnable reset,
                                  int[] original) {

        long[] times = new long[10];

        for (int i = 0; i < 10; i++) {

            int[] clone = Arrays.copyOf(original, original.length);

            reset.run();
            long start = System.nanoTime();
            algorithm.accept(clone);
            long end = System.nanoTime();

            times[i] = end - start;
        }

        long[] valid = Arrays.copyOfRange(times, 3, 10);

        System.out.println("\n--- " + name + " ---");
        System.out.println("Mediana(ns): " + median(valid));
    }
}
