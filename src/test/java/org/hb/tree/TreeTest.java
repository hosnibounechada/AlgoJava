package org.hb.tree;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TreeTest {

    @Test
    void itShouldTraverseBF() {
        // Given
        String expectedString = "A -> B -> C -> D -> E -> F -> G -> null";
        // When
        Node<String> nodeA = new Node<>("A");
        // Children of A
        nodeA.add("B");
        nodeA.add("C");
        nodeA.add("D");

        // Children of C
        nodeA.getChildren().get(1).add("E");
        nodeA.getChildren().get(1).add("F");

        // Children of D
        nodeA.getChildren().get(2).add("G");

        Tree<String> tree = new Tree<>();
        tree.setRoot(nodeA);
        // Then

        // Create a mock PrintStream
        PrintStream mockPrintStream = mock(PrintStream.class);

        // Replace the System.out PrintStream with the mockPrintStream
        System.setOut(mockPrintStream);

        tree.traverseBF();

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(1)).println(argumentCaptor.capture());

        // Then
        assertEquals(expectedString, argumentCaptor.getValue());

        // Reset the System.out PrintStream
        System.setOut(System.out);
    }

    @Test
    void itShouldTraverseDF() {
        // Given
        String expectedString = "A -> B -> C -> E -> F -> D -> G -> null";
        // When
        Node<String> nodeA = new Node<>("A");
        // Children of A
        nodeA.add("B");
        nodeA.add("C");
        nodeA.add("D");

        // Children of C
        nodeA.getChildren().get(1).add("E");
        nodeA.getChildren().get(1).add("F");

        // Children of D
        nodeA.getChildren().get(2).add("G");

        Tree<String> tree = new Tree<>();
        tree.setRoot(nodeA);
        // Then

        // Create a mock PrintStream
        PrintStream mockPrintStream = mock(PrintStream.class);

        // Replace the System.out PrintStream with the mockPrintStream
        System.setOut(mockPrintStream);

        tree.traverseDF();

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(1)).println(argumentCaptor.capture());

        // Then
        assertEquals(expectedString, argumentCaptor.getValue());

        // Reset the System.out PrintStream
        System.setOut(System.out);
    }
}