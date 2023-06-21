package org.hb.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void itShouldPush() {
        // Given
        int[] expectedStack = {1, 2, 3, 4, 5};
        // When
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // Then
        assertArrayEquals(expectedStack, stack.getStack());
    }

    @Test
    void itShouldPop() {
        // Given
        int[] expectedStack = {1, 2, 0, 0, 0};
        int expectedItem = 5;
        // When
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int item = stack.pop();
        stack.pop();
        stack.pop();
        // Then
        assertEquals(expectedItem, item);
        assertArrayEquals(expectedStack, stack.getStack());
    }

    @Test
    void itShouldPeek() {
        // Given
        int expectedValue = 3;
        // When
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(expectedValue);
        // Then
        assertEquals(expectedValue, stack.peek());
    }
}