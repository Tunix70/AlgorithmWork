package com.syncretis;

public class BubbleSort implements Sort {
    private String name;

    public BubbleSort(String name) {
        this.name = name;
    }

    @Override
    public int[] sort(int[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int a = 1; a < arr.length; a++) {
                if (arr[a - 1] > arr[a]) {
                    arr[a - 1] = swapElements(arr[a], arr[a] = arr[a - 1]);
                    flag = false;
                }
            }
            if (flag) break;
        }
        return arr;
    }

    @Override
    public String getName() {
        return this.name = name;
    }
}
