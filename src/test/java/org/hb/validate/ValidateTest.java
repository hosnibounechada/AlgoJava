package org.hb.validate;

import org.hb.bst.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    @Test
    void itShouldBeValidBTS() {
        // Given
        Node<String> root = new Node<>("D");
        root.insert("B"); // B
        root.insert("F"); // F
        root.insert("A"); // A
        root.insert("C"); // C
        root.insert("E"); // E
        root.insert("G"); // G
        // When
        Validate validate = new Validate();
        boolean valid = validate.validate(root);
        // Then
        assertTrue(valid);
    }

    void itShouldNotBeValidBTS() {
        // Given
        Node<String> root = new Node<>("D");
        root.insert("B"); // B
        root.insert("F"); // F
        root.insert("A"); // A
        root.insert("C"); // C
        root.insert("E"); // E
        root.insert("G"); // G

        Node<String> nodeZ = new Node<>("Z");
        root.getLeft().getLeft().setLeft(nodeZ);

        // When
        Validate validate = new Validate();
        boolean valid = validate.validate(root);
        // Then
        assertFalse(valid);
    }
}