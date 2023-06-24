package org.hb.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void itShouldInsertNewIntegerNodes() {
        // Given
        int expectedRoot = 10;

        int expectedRootLeft = 5;
        int expectedRootRight = 15;

        int expectedRootLeftLeft = 3;
        int expectedRootLeftRight = 7;
        int expectedRootRightLeft = 12;
        int expectedRootRightRight = 17;

        // When
        Node<Integer> root = new Node<>(10);
        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);
        root.insert(12);
        root.insert(17);
        // Then
        assertEquals(expectedRoot, root.getData());
        assertEquals(expectedRootLeft, root.getLeft().getData());
        assertEquals(expectedRootRight, root.getRight().getData());
        assertEquals(expectedRootLeftLeft, root.getLeft().getLeft().getData());
        assertEquals(expectedRootLeftRight, root.getLeft().getRight().getData());
        assertEquals(expectedRootRightLeft, root.getRight().getLeft().getData());
        assertEquals(expectedRootRightRight, root.getRight().getRight().getData());
    }

    @Test
    void itShouldInsertNewStringNodes() {
        // Given
        String expectedRoot = "D";

        String expectedRootLeft = "B";
        String expectedRootRight = "F";

        String expectedRootLeftLeft = "A";
        String expectedRootLeftRight = "C";
        String expectedRootRightLeft = "E";
        String expectedRootRightRight = "G";

        // When
        Node<String> root = new Node<>("D");
        root.insert("B");
        root.insert("F");
        root.insert("A");
        root.insert("C");
        root.insert("E");
        root.insert("G");
        // Then
        assertEquals(expectedRoot, root.getData());
        assertEquals(expectedRootLeft, root.getLeft().getData());
        assertEquals(expectedRootRight, root.getRight().getData());
        assertEquals(expectedRootLeftLeft, root.getLeft().getLeft().getData());
        assertEquals(expectedRootLeftRight, root.getLeft().getRight().getData());
        assertEquals(expectedRootRightLeft, root.getRight().getLeft().getData());
        assertEquals(expectedRootRightRight, root.getRight().getRight().getData());
    }
}