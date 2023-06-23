package org.hb.weave;

import org.hb.queue.Queue;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WeaveTest {

    @Test
    void itShouldWeave() {
        // Given
        Queue<Integer> sourceOne = new Queue<>(3);
        Queue<Integer> sourceTwo = new Queue<>(2);

        sourceOne.enqueue(1);
        sourceOne.enqueue(2);
        sourceOne.enqueue(3);

        sourceTwo.enqueue(4);
        sourceTwo.enqueue(5);

        int[] expectedQueue = {1, 4, 2, 5, 3};
        // When
        Weave<Integer> weave = new Weave<>();
        Queue<Integer> queue = weave.weave(sourceOne, sourceTwo);

        int[] result = Arrays.stream(queue.getArrayList().toArray())
                .mapToInt(Integer::intValue)
                .toArray();

        // Then
        assertArrayEquals(expectedQueue, result);
    }
}