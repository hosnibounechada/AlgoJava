package org.hb.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void itShouldBubbleSort() {
        // Given
        int[] arr = {4, 2, 3, 1};
        int[] expectedResult = {1, 2, 3, 4};
        // When
        Sort sort = new Sort();
        int[] result = sort.bubbleSort(arr);
        // Then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void itShouldSelectionSort() {
        // Given
        int[] arr = {4, 2, 3, 1};
        int[] expectedResult = {1, 2, 3, 4};
        // When
        Sort sort = new Sort();
        int[] result = sort.selectionSort(arr);
        // Then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void itShouldMergeSort() {
        // Given
        int[] arr = {4, 2, 3, 1};
        int[] expectedResult = {1, 2, 3, 4};
        // When
        Sort sort = new Sort();
        int[] result = sort.mergeSort(arr);
        // Then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void itShouldMerge() {
        // Given
        int[] arrOne = {1, 3};
        int[] arrTwo = {2, 4};
        int[] expectedResult = {1, 2, 3, 4};
        // When
        Sort sort = new Sort();
        int[] result = sort.merge(arrOne, arrTwo);
        // Then
        assertArrayEquals(expectedResult, result);
    }
}