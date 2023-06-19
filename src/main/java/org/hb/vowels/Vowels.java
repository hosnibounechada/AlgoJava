package org.hb.vowels;

public class Vowels {

    // --- Directions
    // Write a function that returns the number of vowels
    // used in a string.  Vowels are the characters 'a', 'e'
    // 'i', 'o', and 'u'.
    // --- Examples
    //   vowels('Hi There!') --> 3
    //   vowels('Why do you ask?') --> 4
    //   vowels('Why?') --> 0

    public int numberOfVowels(String str) {
        char[] checker = {'a', 'e', 'i', 'o', 'u'};
        int total = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if (contains(checker, ch)) total++;
        }
        return total;
    }

    private boolean contains(char[] chars, char ch) {
        for (char c : chars) {
            if (c == ch) return true;
        }
        return false;
    }
}


