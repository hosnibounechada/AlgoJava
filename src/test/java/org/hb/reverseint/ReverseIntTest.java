package org.hb.reverseint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntTest {

    @Test
    public void firstTestShouldReturnZero(){
        int input = 0;
        int expected = 0;

        ReverseInt reverser = new ReverseInt();

        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input, expected);

        assertEquals(expected, reverser.reverseInt(input));
    }

    @Test
    public void reverseFlipPositiveNumbers(){
        int input = 5, expected = 5;
        int input1 = 10, expected1 = 1;
        int input2 = 15, expected2 = 51;
        int input3 = 1234, expected3 = 4321;

        ReverseInt reverser = new ReverseInt();

        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input, expected);
        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input1, expected1);
        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input2, expected2);
        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input3, expected3);

        assertEquals(expected, reverser.reverseInt(input));
        assertEquals(expected1, reverser.reverseInt(input1));
        assertEquals(expected2, reverser.reverseInt(input2));
        assertEquals(expected3, reverser.reverseInt(input3));
    }

    @Test
    public void reverseFlipNegativeNumbers(){
        int input = -5, expected = -5;
        int input1 = -10, expected1 = -1;
        int input2 = -15, expected2 = -51;
        int input3 = -1234, expected3 = -4321;

        ReverseInt reverser = new ReverseInt();

        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input, expected);
        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input1, expected1);
        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input2, expected2);
        System.out.printf("The reverse of \"%d\" is \"%d\".\n",input3, expected3);

        assertEquals(expected, reverser.reverseInt(input));
        assertEquals(expected1, reverser.reverseInt(input1));
        assertEquals(expected2, reverser.reverseInt(input2));
        assertEquals(expected3, reverser.reverseInt(input3));
    }
}