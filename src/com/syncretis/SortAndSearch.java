package com.syncretis;

import com.syncretis.sortImpl.QuickSort;

public class SortAndSearch {
    QuickSort quickSort = new QuickSort("QUICK");

    public int bencharkSAS(int arr[], int searchNum) {
        int[] sortArr = quickSort.sort(arr);

        int left = 0;
        int right = sortArr.length;
        int mid = 0;
        int count = 0;

        while (!(left >= right)) {
            count++;
            mid = left + (right - left) / 2;
            if (sortArr[mid] == searchNum) {
                return count;
            } else if (sortArr[mid] > searchNum) {
                right = mid;
            } else
                left = mid + 1;
        }
        return 0;
    }
}
