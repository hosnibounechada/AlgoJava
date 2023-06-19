package org.hb.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.io.PrintStream;
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

        int n = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(n);

        // Verifying the number of times System.out.println() is called
        verify(mockPrintStream, times(n)).println(anyString());

    }

    @Test
    public void secondFizzBuzzTest() {
        int n = 15;
        List<String> expectedlist = List.of("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz");

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(n);

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(n)).println(argumentCaptor.capture());

        for(int i = 0; i < n; i++){
            assertEquals(expectedlist.get(i), argumentCaptor.getAllValues().get(i));
        }
    }
}