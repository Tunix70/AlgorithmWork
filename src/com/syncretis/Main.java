package com.syncretis;

public class Main {

    public static void main(String[] args) {
        int[] arr = createArr(4);

        Statistics statistics = new Statistics();
        statistics.printStats(arr.clone(), new BubbleSort("Bubble Sort"));
        statistics.printStats(arr.clone(), new SelectSort("Select Sort"));
        statistics.printStats(arr.clone(), new QuickSort("Quick Sort"));

        System.out.println("Time of sorting array and search number searchNum" + new SortAndSearch().bencharkSAS(arr, 1));
    }

    public static int[] createArr(int elements) {
        int[] arr = new int[elements];
        for (int i = 1; i < elements; i++) {
            arr[i] = (int) (Math.random() * 10 * elements);
        }
        return arr;
    }
}
