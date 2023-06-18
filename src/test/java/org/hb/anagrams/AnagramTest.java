package org.hb.anagrams;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void firstTestShouldReturnTrue(){
        String word1 = "hello";
        String word2 = "olleh";

        System.out.printf("\"%s\" is an anagram of \"%s\"%n", word1, word2);

        assertTrue(Anagram.anagrams(word1,word2));
    }

    @Test
    public void secondTestShouldReturnTrue(){
        String word1 = "Whoa! Hi!";
        String word2 = "Hi! Whoa!";

        System.out.printf("\"%s\" is an anagram of \"%s\"%n", word1, word2);

        assertTrue(Anagram.anagrams(word1,word2));
    }

    @Test
    public void thirdTestShouldReturnFalse(){
        String word1 = "One One";
        String word2 = "Two two two";

        System.out.printf("\"%s\" is not an anagram of \"%s\"%n", word1, word2);

        assertFalse(Anagram.anagrams(word1,word2));
    }
    @Test
    public void fourthTestShouldReturnFalse(){
        String word1 = "One one";
        String word2 = "One one c";

        System.out.printf("\"%s\" is not an anagram of \"%s\"%n", word1, word2);

        assertFalse(Anagram.anagrams(word1,word2));
    }

    @Test
    public void fifthTestShouldReturnFalse(){
        String word1 = "A tree, a life, a bench";
        String word2 = "A tree, a fence, a yard";

        System.out.printf("\"%s\" is not an anagram of \"%s\"%n", word1, word2);

        assertFalse(Anagram.anagrams(word1,word2));
    }

}