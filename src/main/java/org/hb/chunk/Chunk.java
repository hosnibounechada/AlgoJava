package org.hb.chunk;

public class Chunk {
    // --- Directions
    // Given an array and chunk size, divide the array into many subarrays
    // where each subarray is of length size
    // --- Examples
    // chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
    // chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
    // chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
    // chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
    // chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

    public int[][] chunk(int[] arr, int size) {
        int[][] res = new int[Math.ceilDiv(arr.length, size)][];

        int i = 0;
        int row = 0;

        while (i < arr.length) {
            if (i % size == 0) {
                res[row] = new int[Math.min(size, arr.length - i)];
            }

            res[row][i % size] = arr[i];
            i++;

            if (i % size == 0) {
                row++;
            }
        }
        return res;
    }
}
