package org.hb.maxchar;

import java.util.HashMap;
import java.util.Map;

public class MaxChar {
    // --- Directions
    // Given a string, return the character that is most
    // commonly used in the string.
    // --- Examples
    // maxChar("abcccccccd") === "c"
    // maxChar("apple 1231111") === "1"

    public char maxChar(String str) {
        char[] charArray = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char value : charArray) {
            map.merge(value, 1, Integer::sum);
        }
        char maxC = ' ';
        int max = 0;

        for (char c : map.keySet()) {
            if (max < map.get(c)) {
                maxC = c;
                max = map.get(c);
            }
        }

        return maxC;
    }
}
