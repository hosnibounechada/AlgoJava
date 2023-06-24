package org.hb.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void itShouldGenerateSpiralMatrix() {
        // Given
        int n = 3;
        int[][] expectedResult = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        // When
        Matrix matrix = new Matrix();
        int[][] result = matrix.matrix(n);

        // Then
        for(int i = 0; i < n; i++){
            assertArrayEquals(expectedResult[i], result[i]);
        }
    }
}