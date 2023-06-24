package org.hb.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void itShouldSearchAndFindNode() {
        // Given
        String expectedResult = "A";

        Node<String> root = new Node<>("D");
        root.insert("B");
        root.insert("F");
        root.insert("A");
        root.insert("C");
        root.insert("E");
        root.insert("G");

        // When
        BST bst = new BST();
        Node<String> node = bst.contains("A", root);

        // Then
        assertEquals(expectedResult, node.getData());
    }

    @Test
    void itShouldSearchAndNotFindNode() {
        // Given

        Node<String> root = new Node<>("D");
        root.insert("B");
        root.insert("F");
        root.insert("A");
        root.insert("C");
        root.insert("E");
        root.insert("G");

        // When
        BST bst = new BST();
        Node<String> node = bst.contains("R", root);

        // Then
        assertNull(node);
    }
}