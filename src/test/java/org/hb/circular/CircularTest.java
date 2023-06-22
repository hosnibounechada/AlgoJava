package org.hb.circular;

import org.hb.linkedlist.LinkedList;
import org.hb.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularTest {

    @Test
    void itShouldBeCircular() {
        // Given
        boolean expectedValue = true;
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Node<String> nodeThree = list.getAt(2);
        Node<String> nodeFive = list.getAt(4);

        nodeFive.setNext(nodeThree);

        Circular<String> circular = new Circular<>(list);

        boolean isCircular = circular.isCircular();

        nodeFive.setNext(null);
        // Then
        assertEquals(expectedValue, isCircular);
    }

    @Test
    void itShouldNotBeCircular() {
        // Given
        boolean expectedValue = false;

        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Circular<String> circular = new Circular<>(list);

        boolean isCircular = circular.isCircular();

        // Then
        assertEquals(expectedValue, isCircular);
    }
}