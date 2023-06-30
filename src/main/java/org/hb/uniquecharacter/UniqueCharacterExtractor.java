package org.hb.uniquecharacter;

import java.util.*;
import java.util.stream.IntStream;

public class UniqueCharacterExtractor {
    // --- Directions
    // Return list of unique characters from given string.
    // --- Examples
    //   removeDuplicateCharacters("abcabc") --> ['a', 'b', 'c']

    public List<Character> removeDuplicateCharacters(String str) {
        List<Character> list = IntStream.range(0, str.length()).mapToObj(str::charAt).toList();
        return new HashSet<>(list).stream().toList();
    }
}
