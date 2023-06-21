package org.hb.qfroms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QFromSTest {

    @Test
    void itShouldAdd() {
        // Given
        int capacity = 3;
        int expectedItem = 1;
        // When
        QFromS q = new QFromS(capacity);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // Then
        assertEquals(expectedItem, q.peek());
    }

    @Test
    void itShouldRemove() {
        // Given
        int capacity = 3;
        int expectedItem = 2;
        // When
        QFromS q = new QFromS(capacity);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        int item = q.remove();
        // Then
        assertEquals(expectedItem, item);
    }

    @Test
    void itShouldPeek() {
        // Given
        int capacity = 3;
        int expectedItem = 3;
        // When
        QFromS q = new QFromS(capacity);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.remove();
        // Then
        assertEquals(expectedItem, q.peek());
    }
}