package org.hb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    public void firstTestShouldReturn5(){
        String str = "aeiou";
        int expected = 5;

        Vowels vowels = new Vowels();

        System.out.printf("Number of vowels in \"%s\" is \"%d\"\n", str, expected);

        assertEquals(expected, vowels.numberOfVowels(str));
    }

    @Test
    public void secondTestShouldReturn5(){
        String str = "AEIOU";
        int expected = 5;

        Vowels vowels = new Vowels();

        System.out.printf("Number of vowels in \"%s\" is \"%d\"\n", str, expected);

        assertEquals(expected, vowels.numberOfVowels(str));
    }

    @Test
    public void thirdTestShouldReturn5(){
        String str = "abcdefghijklmnopqrstuvwxyz";
        int expected = 5;

        Vowels vowels = new Vowels();

        System.out.printf("Number of vowels in \"%s\" is \"%d\"\n", str, expected);

        assertEquals(expected, vowels.numberOfVowels(str));
    }

    @Test
    public void fourthTestShouldReturn5(){
        String str = "bcdfghjkl";
        int expected = 0;

        Vowels vowels = new Vowels();

        System.out.printf("Number of vowels in \"%s\" is \"%d\"\n", str, expected);

        assertEquals(expected, vowels.numberOfVowels(str));
    }
}