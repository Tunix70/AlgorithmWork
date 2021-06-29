package com.syncretis.sortInterface;

public interface Sort {
    int[] sort(int[] arr);

    String getName();

    default int swapElements(final int first, final int second) {
        return first;
    }

}
