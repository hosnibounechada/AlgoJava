package org.hb.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void itShouldHasDataAndChildrenProperties() {
        // Given
        String expectedValue = "a";
        int expectedLength = 0;
        // When
        Node<String> node = new Node<>("a");
        // Then
        assertEquals(expectedValue, node.getData());
        assertEquals(expectedLength, node.getChildren().size());
    }

    @Test
    void itShouldAddChildren() {
        // Given
        String expectedValue = "b";
        int expectedLength = 1;
        // When
        Node<String> nodeA = new Node<>("a");
        nodeA.add("b");

        // Then

        assertEquals("b", nodeA.getChildren().get(0).getData());
        assertEquals(expectedLength, nodeA.getChildren().size());
    }

    @Test
    void itShouldRemoveNode() {
        // Given
        int expectedLength = 0;
        // When
        Node<String> nodeA = new Node<>("a");
        nodeA.add("b");

        nodeA.remove("b");

        // Then
        assertEquals(expectedLength, nodeA.getChildren().size());
    }
}