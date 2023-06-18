package org.hb.anagrams;

// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

import java.util.Arrays;

public class Anagram {

    private static String cleanString(String str) {
        char[] charArray = str
                .replaceAll("\\W", "")
                .toLowerCase()
                .toCharArray();

        Arrays.sort(charArray);

        return new String(charArray);
    }

    public static boolean anagrams(String stringA, String stringB) {
        return cleanString(stringA).equals(cleanString(stringB));
    }
}
