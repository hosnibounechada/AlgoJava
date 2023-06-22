package org.hb.linkedlist;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LinkedListTest {

    @Test
    void itShouldGetSize() {
        // Given
        int expectedSize = 4;
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        // Then
        assertEquals(expectedSize, list.getSize());
    }

    @Test
    void itShouldAdd() {
        // Given
        Node<String> expectedNode = new Node<>("hello");
        // When
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        // Then
        assertEquals(expectedNode.getData(), list.getFirst().getData());
    }

    @Test
    void itShouldPrintList() {
        // Given
        String expectedString = "one -> two -> three -> four -> null";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        // Create a mock PrintStream
        PrintStream mockPrintStream = mock(PrintStream.class);

        // Replace the System.out PrintStream with the mockPrintStream
        System.setOut(mockPrintStream);

        list.printList();

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
    void itShouldGetFirst() {
        // Given
        String expectedValue = "one";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        // Then
        assertEquals(expectedValue, list.getFirst().getData());
    }

    @Test
    void itShouldGetLast() {
        // Given
        String expectedValue = "three";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        // Then
        assertEquals(expectedValue, list.getLast().getData());
    }

    @Test
    void itShouldClear() {
        // Given
        int expectedSize = 0;
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        list.clear();
        // Then
        assertEquals(expectedSize, list.getSize());
    }

    @Test
    void itShouldInsertFirst() {
        // Given
        String expectedValue = "one";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("two");
        list.add("three");

        list.insertFirst(expectedValue);
        // Then
        assertEquals(expectedValue, list.getFirst().getData());
    }

    @Test
    void itShouldInsertLast() {
        // Given
        String expectedValue = "three";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");

        list.insertLast("three");
        // Then
        assertEquals(expectedValue, list.getLast().getData());
    }

    @Test
    void itShouldRemoveFirst() {
        // Given
        String expectedValue = "two";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        list.removeFirst();
        // Then
        assertEquals(expectedValue, list.getFirst().getData());
    }

    @Test
    void itShouldRemoveLast() {
        // Given
        String expectedValue = "two";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        list.removeLast();
        // Then
        assertEquals(expectedValue, list.getLast().getData());
    }

    @Test
    void itShouldGetAt() {
        // Given
        String expectedValue = "two";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        Node<String> node = list.getAt(1);
        // Then
        assertEquals(expectedValue, node.getData());
    }

    @Test
    void itShouldInsertAfter() {
        // Given
        Node<String> expectedNode = new Node<>("two");
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("three");

        Node<String> node = list.getAt(0);

        list.insertAfter(expectedNode, node);

        // Then

        assertEquals(expectedNode, list.getAt(1));
    }

    @Test
    void itShouldInsertAt() {
        // Given
        Node<String> expectedNode = new Node<>("two");
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("three");

        list.insertAt(1, expectedNode);

        // Then
        assertEquals(expectedNode, list.getAt(1));
    }

    @Test
    void itShouldRemoveAt() {
        // Given
        String expectedValue = "three";
        // When
        LinkedList<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        list.removeAt(1);

        // Then
        assertEquals(expectedValue, list.getAt(1).getData());
    }

    @Test
    void itShouldInvokeConsumerForAllNodes() {
        // Given
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> consumedNodes = new ArrayList<>();

        // When
        Consumer<Node<Integer>> consumer = node -> consumedNodes.add(node.getData());
        list.forEachItem(consumer);

        // Then
        List<Integer> expectedNodes = List.of(1, 2, 3, 4);
        assertEquals(expectedNodes, consumedNodes);
    }

    @Test
    void itShouldInvokeBiConsumerForAllNodesWithIndices() {
        // Given
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        List<String> consumedNodes = new ArrayList<>();
        List<Integer> consumedIndices = new ArrayList<>();

        // When
        BiConsumer<Node<String>, Integer> biConsumer = (node, index) -> {
            consumedNodes.add(node.getData());
            consumedIndices.add(index);
        };
        list.forEachItem(biConsumer);

        // Then
        List<String> expectedNodes = List.of("one", "two", "three", "four");
        List<Integer> expectedIndices = List.of(0, 1, 2, 3);
        assertEquals(expectedNodes, consumedNodes);
        assertEquals(expectedIndices, consumedIndices);
    }
}