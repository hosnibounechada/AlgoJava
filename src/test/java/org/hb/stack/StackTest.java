package org.hb.stack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void itShouldPush() {
        // Given
        int[] expectedStack = {1, 2, 3, 4, 5};
        // When
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int[] result = Arrays.stream(stack.getArrayList().toArray())
                .mapToInt(Integer::intValue)
                .toArray();
        // Then
        assertArrayEquals(expectedStack, result);
    }

    @Test
    void itShouldPop() {
        // Given
        int[] expectedStack = {1, 2};
        int expectedItem = 5;
        // When
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int removedItem = stack.pop();
        stack.pop();
        stack.pop();

        int[] result = Arrays.stream(stack.getArrayList().toArray())
                .mapToInt(Integer::intValue)
                .toArray();
        // Then
        assertEquals(expectedItem, removedItem);
        assertArrayEquals(expectedStack, result);
    }

    @Test
    void itShouldPeek() {
        // Given
        int expectedValue = 3;
        // When
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(expectedValue);
        // Then
        assertEquals(expectedValue, stack.peek());
    }
}