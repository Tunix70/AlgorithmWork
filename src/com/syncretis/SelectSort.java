package com.syncretis;

public class SelectSort implements Sort{
    private String name;

    public SelectSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                arr[i] = swapElements(arr[index], arr[index] = arr[i]);
            }
        }
        return arr;
    }

    @Override
    public String getName() {
        return this.name = name;
    }
}
