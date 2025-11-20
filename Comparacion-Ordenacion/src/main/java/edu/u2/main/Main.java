package edu.u2.main;

import edu.u2.sorting.*;

public class Main {
    public static void main(String[] args) {
        int[] vec = {5, 4, 3, 2, 1};

        //BubbleSort.sort(vec, true);
        InsertionSort.sort(vec, true);
        //SelectionSort.sort(vec, true);
    }
}