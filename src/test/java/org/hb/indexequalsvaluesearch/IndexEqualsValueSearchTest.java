package org.hb.indexequalsvaluesearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexEqualsValueSearchTest {

    @Test
    void itShouldReturnTheLowestIndex() {
        // Given
        int expectedResult = 2;
        int[] arr = {-5, 0, 2, 7};

        // When
        IndexEqualsValueSearch ievs = new IndexEqualsValueSearch();
        int result = ievs.indexEqualsValueSearch(arr);

        // Then
        assertEquals(expectedResult, result);

    }

    @Test
    void itShouldReturnMinusOne() {
        // Given
        int expectedResult = -1;
        int[] arr = {4, 7};

        // When
        IndexEqualsValueSearch ievs = new IndexEqualsValueSearch();
        int result = ievs.indexEqualsValueSearch(arr);

        // Then
        assertEquals(expectedResult, result);
    }
}