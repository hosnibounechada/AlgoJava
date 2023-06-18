package org.hb.maxchar;

import org.hb.anagrams.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCharTest {
    @Test
    public void maxCharShouldBe_a(){
        String str = "abcdefghijklmnaaaaa";
        char expected = 'a';

        System.out.printf("the max char of \"%s\" is \"%s\"%n", str, expected);

        MaxChar maxChar = new MaxChar();

        assertEquals(expected, maxChar.maxChar(str));
    }

    @Test
    public void maxCharShouldBe_1(){
        String str = "ab1c1d1e1f1g1";
        char expected = '1';

        System.out.printf("the max char of \"%s\" is \"%s\"%n", str, expected);

        MaxChar maxChar = new MaxChar();

        assertEquals(expected, maxChar.maxChar(str));
    }
}