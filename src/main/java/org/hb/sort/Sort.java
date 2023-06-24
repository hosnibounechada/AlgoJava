package org.hb.sort;

import java.util.Arrays;

public class Sort {
    // --- Directions
    // Implement bubbleSort, selectionSort, and mergeSort

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) swap(arr, i, minIndex);
        }
        return arr;
    }

    public int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int center = Math.floorDiv(arr.length, 2);

        int[] left = Arrays.copyOfRange(arr, 0, center);
        int[] right = Arrays.copyOfRange(arr, center, arr.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public int[] merge(int[] arrOne, int[] arrTwo) {
        int[] arr = new int[arrOne.length + arrTwo.length];
        int i = 0, j = 0;
        while(i + j < arr.length){
            if(i == arrOne.length){
                arr[i + j] = arrTwo[j];
                j++;
            }else if(j == arrTwo.length){
                arr[i + j] = arrOne[i];
                i++;
            } else if(arrOne[i] < arrTwo[j]){
                arr[i + j] = arrOne[i];
                i++;
            }else{
                arr[i + j] = arrTwo[j];
                j++;
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
