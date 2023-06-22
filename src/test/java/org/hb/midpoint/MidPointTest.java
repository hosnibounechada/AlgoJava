package org.hb.midpoint;

import org.hb.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MidPointTest {

    @Test
    void itShouldGetMidPointUsingSize() {
        // Given
        String expectedValue = "three";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        MidPoint<String> midPoint = new MidPoint<>(list);
        // Then
        assertEquals(expectedValue, midPoint.midPointUsingSize().getData());
    }

    @Test
    void itShouldGetMidPointUsingIteration() {
        // Given
        String expectedValue = "three";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        MidPoint<String> midPoint = new MidPoint<>(list);
        // Then
        assertEquals(expectedValue, midPoint.midPointUsingIteration().getData());
    }
}