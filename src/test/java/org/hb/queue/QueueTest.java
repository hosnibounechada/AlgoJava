package org.hb.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void itShouldEnqueue() {
        // Given
        int[] expectedQueue = {5, 4, 3, 2, 1};
        int expectedSize = 5;
        // When
        Queue queue = new Queue(expectedQueue.length);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        // Then
        assertEquals(expectedSize, queue.getSize());
        assertArrayEquals(expectedQueue, queue.getArrayQueue());
    }

    @Test
    void itShouldDequeue() {
        // Given
        int expectedItem = 2;
        int[] expectedQueue = {5, 4, 0, 0, 0};
        int expectedSize = 2;
        // When
        Queue queue = new Queue(expectedQueue.length);
        queue.enqueue(1);
        queue.enqueue(expectedItem);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        int item = queue.dequeue();
        queue.dequeue();
        // Then
        assertEquals(expectedItem, item);
        assertEquals(expectedSize, queue.getSize());
        assertArrayEquals(expectedQueue, queue.getArrayQueue());
    }
}