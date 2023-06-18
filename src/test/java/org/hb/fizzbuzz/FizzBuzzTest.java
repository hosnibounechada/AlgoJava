package org.hb.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class FizzBuzzTest {
    @Mock
    private PrintStream mockPrintStream = mock(PrintStream.class);
    @BeforeEach
    void setUp() {
        System.setOut(mockPrintStream);
    }

    @Test
    public void firstFizzBuzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(5);

        // Verifying the number of times System.out.println() is called
        verify(mockPrintStream, times(5)).println(anyString());

    }

    @Test
    public void secondFizzBuzzTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(15);

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(15)).println(argumentCaptor.capture());

        assertEquals("1", argumentCaptor.getAllValues().get(0));
        assertEquals("2", argumentCaptor.getAllValues().get(1));
        assertEquals("fizz", argumentCaptor.getAllValues().get(2));
        assertEquals("4", argumentCaptor.getAllValues().get(3));
        assertEquals("buzz", argumentCaptor.getAllValues().get(4));
        assertEquals("fizz", argumentCaptor.getAllValues().get(5));
        assertEquals("7", argumentCaptor.getAllValues().get(6));
        assertEquals("8", argumentCaptor.getAllValues().get(7));
        assertEquals("fizz", argumentCaptor.getAllValues().get(8));
        assertEquals("buzz", argumentCaptor.getAllValues().get(9));
        assertEquals("11", argumentCaptor.getAllValues().get(10));
        assertEquals("fizz", argumentCaptor.getAllValues().get(11));
        assertEquals("13", argumentCaptor.getAllValues().get(12));
        assertEquals("14", argumentCaptor.getAllValues().get(13));
        assertEquals("fizzbuzz", argumentCaptor.getAllValues().get(14));
    }
}