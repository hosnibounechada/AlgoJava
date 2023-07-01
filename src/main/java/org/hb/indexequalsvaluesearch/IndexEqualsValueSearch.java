package org.hb.indexequalsvaluesearch;

public class IndexEqualsValueSearch {
    // --- Directions
    // Given a sorted array of distinct integers, return the lowest index which index == arr[index]
    // --- Examples
    //    [-5, 1, 2, 7] => 2
    //    [1, 2] => -1

    public int indexEqualsValueSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == mid) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}