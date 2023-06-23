package org.hb.queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void itShouldEnqueue() {
        // Given
        int[] expectedQueue = {1, 2, 3, 4, 5};
        int expectedSize = 5;
        // When
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        // Then

        int[] result = Arrays.stream(queue.getArrayList().toArray())
                .mapToInt(Integer::intValue)
                .toArray();

        assertEquals(expectedSize, queue.getSize());

        assertArrayEquals(expectedQueue, result);
    }

    @Test
    void itShouldDequeue() {
        // Given
        int expectedItem = 2;
        int[] expectedQueue = {4, 5};
        int expectedSize = 2;
        // When
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        queue.enqueue(expectedItem);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        int dequeuedItem = queue.dequeue();
        queue.dequeue();

        int[] result = Arrays.stream(queue.getArrayList().toArray())
                .mapToInt(Integer::intValue)
                .toArray();

        // Then
        assertEquals(expectedItem, dequeuedItem);
        assertEquals(expectedSize, queue.getSize());
        assertArrayEquals(expectedQueue, result);
    }
}