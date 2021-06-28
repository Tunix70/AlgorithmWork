package com.syncretis;

public class QuickSort implements Sort {
    private String name;

    public QuickSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;

            if (left <= right) {
                arr[left] = swapElements(arr[right], arr[right] = arr[left]);
                left++;
                right--;
            }
        }
        return left;
    }

    private int[] quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
        return arr;
    }

    @Override
    public String getName() {
        return this.name = name;
    }
}
