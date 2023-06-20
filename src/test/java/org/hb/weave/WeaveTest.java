package org.hb.weave;

import org.hb.queue.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaveTest {

    @Test
    void itShouldWeave() {
        // Given
        Queue sourceOne = new Queue(3);
        Queue sourceTwo = new Queue(2);

        sourceOne.enqueue(1);
        sourceOne.enqueue(2);
        sourceOne.enqueue(3);

        sourceTwo.enqueue(4);
        sourceTwo.enqueue(5);

        int[] expectedQueue = {3, 5, 2, 4, 1};
        // When
        Weave weave = new Weave();
        Queue q = weave.weave(sourceOne, sourceTwo);

        // Then
        assertArrayEquals(expectedQueue, q.getArrayQueue());
    }
}