package org.hb.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseTest {
    @Test
    public void firstReverseTest(){
        String word = "abcd";
        String reversedWord = "dcba";

        System.out.printf("\"%s\" is the reverse of \"%s\"%n", word, reversedWord);

        Assertions.assertEquals(reversedWord, Reverse.reverseString(word));
    }

    @Test
    public void secondReverseTest(){
        String word = "dcba  ";
        String reversedWord = "  abcd";

        System.out.printf("\"%s\" is the reverse of \"%s\"%n", word, reversedWord);

        Assertions.assertEquals(reversedWord, Reverse.reverseString(word));
    }
}