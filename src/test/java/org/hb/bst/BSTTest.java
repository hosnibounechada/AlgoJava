package org.hb.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @Test
    void itShouldSearchAndFindNode() {
        // Given
        boolean expectedResult = true;

        Node<String> root = new Node<>("D");
        root.insert("B");
        root.insert("F");
        root.insert("A");
        root.insert("C");
        root.insert("E");
        root.insert("G");

        // When
        BST bst = new BST();
        boolean result = bst.search("A", root);

        // Then
        assertEquals(expectedResult, result);
    }

    @Test
    void itShouldSearchAndNotFindNode() {
        // Given
        boolean expectedResult = false;

        Node<String> root = new Node<>("D");
        root.insert("B");
        root.insert("F");
        root.insert("A");
        root.insert("C");
        root.insert("E");
        root.insert("G");

        // When
        BST bst = new BST();
        boolean result = bst.search("R", root);

        // Then
        assertEquals(expectedResult, result);
    }
}