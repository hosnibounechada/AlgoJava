package org.hb.chunk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChunkTest {

    @Test
    void itShouldChunk() {
        // Given
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[][] expectedResult = {{1, 2}, {3, 4}, {5, 6}, {7}};

        // When
        Chunk chunk = new Chunk();
        int[][] res = chunk.chunk(arr, 2);

        // Then
        for(int i = 0; i < res.length; i++){
            assertArrayEquals(expectedResult[i], res[i]);
        }
    }
}