package org.hb.steps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StepsTest {
    @Mock
    private PrintStream mockPrintStream = mock(PrintStream.class);

    @BeforeEach
    void setUp() {
        System.setOut(mockPrintStream);
    }

    @Test
    public void threeStepsTest(){
        int n = 3;
        List<String> expectedlist = List.of("#  ", "## ", "###");

        test(expectedlist, n);
    }

    @Test
    public void fiveStepsTest(){
        int n = 5;
        List<String> expectedlist = List.of("#    ", "##   ", "###  ", "#### ", "#####");

        test(expectedlist, n);
    }

    @Test
    public void sevenStepsTest(){
        int n = 7;
        List<String> expectedlist = List.of("#      ", "##     ", "###    ", "####   ", "#####  ", "###### ", "#######");

        test(expectedlist, n);
    }

    public void test(List<String> expectedlist, int n){
        Steps steps = new Steps();
        steps.printSteps(n);

        // Create an ArgumentCaptor to capture the printed output
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        // Verify that the console.log output matches the expected value
        verify(mockPrintStream, times(n)).println(argumentCaptor.capture());

        for(int i = 0; i < n; i++){
            assertEquals(expectedlist.get(i), argumentCaptor.getAllValues().get(i));
        }
    }

}