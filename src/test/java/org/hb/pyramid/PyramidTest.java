package org.hb.pyramid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PyramidTest {
    @Mock
    private PrintStream mockPrintStream = mock(PrintStream.class);

    @BeforeEach
    void setUp() {
        System.setOut(mockPrintStream);
    }

    @Test
    void itShouldPrintPyramid() {
        // Given
        int n = 3;
        List<String> expectedlist = List.of("  #  ", " ### ", "#####");
        // When
        Pyramid pyramid = new Pyramid();
        pyramid.printPyramid(n);

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(n)).println(argumentCaptor.capture());

        // Then
        for (int i = 0; i < n; i++) {
            assertEquals(expectedlist.get(i), argumentCaptor.getAllValues().get(i));
        }
    }

    @Test
    void itShouldPrintPyramidRecursive() {
        // Given
        int n = 5;
        List<String> expectedlist = List.of("    #    ", "   ###   ", "  #####  ", " ####### ", "#########");
        // When
        Pyramid pyramid = new Pyramid();
        pyramid.printPyramidRecursive(n);

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(n)).println(argumentCaptor.capture());

        // Then
        for (int i = 0; i < n; i++) {
            assertEquals(expectedlist.get(i), argumentCaptor.getAllValues().get(i));
        }
    }
}