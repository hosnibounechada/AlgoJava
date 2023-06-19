package org.hb.fib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void itShouldBe5() {
        // Given
        int n = 5;
        int expected = 5;
        // When
        Fib fib = new Fib();
        // Then
        assertEquals(expected, fib.fib(n));
    }

    @Test
    void itShouldBe8() {
        // Given
        int n = 6;
        int expected = 8;
        // When
        Fib fib = new Fib();
        // Then
        assertEquals(expected, fib.fib(n));
    }

    @Test
    void itShouldBe13() {
        // Given
        int n = 7;
        int expected = 13;
        // When
        Fib fib = new Fib();
        // Then
        assertEquals(expected, fib.fibRecursive(n));
    }
}