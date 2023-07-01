package org.hb.addtwonumbers;

import org.hb.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void itShouldBeTruthyFirstTest() {
        // Given
        int[] expectedResult = {7, 0, 8};
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(2);
        l1.add(4);
        l1.add(3);

        l2.add(5);
        l2.add(6);
        l2.add(4);

        // When
        AddTwoNumbers atn = new AddTwoNumbers();
        LinkedList<Integer> list = atn.addTwoNumbers(l1, l2);

        int[] result = Arrays.stream(list.toArray())
                .mapToInt(Integer::intValue)
                .toArray();

        // Then
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void itShouldBeTruthySecondTest() {
        // Given
        int[] expectedResult = {8, 9, 9, 0, 1};
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(9);
        l1.add(9);
        l1.add(9);

        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);

        // When
        AddTwoNumbers atn = new AddTwoNumbers();
        LinkedList<Integer> list = atn.addTwoNumbers(l1, l2);

        int[] result = Arrays.stream(list.toArray())
                .mapToInt(Integer::intValue)
                .toArray();

        // Then
        assertArrayEquals(expectedResult, result);
    }
}