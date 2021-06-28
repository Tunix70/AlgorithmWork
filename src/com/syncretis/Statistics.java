package com.syncretis;

public class Statistics {
    public void printStats(int[] arr, Sort sort) {
        Long startTime = System.nanoTime();
        sort.sort(arr);
        Long finishTime = System.nanoTime();
        Long resultTime = finishTime - startTime;
        System.out.println("Sort time " + sort.getName() + " = " + resultTime);
    }
}
