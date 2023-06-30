package org.hb.duplicates;

import java.util.*;

public class DuplicateCharacters {
    // --- Directions
    // Return list of duplicate characters from given List.
    // --- Examples
    //   duplicateCharacters(['a', 'b', 'c', 'a', 'b']) --> ['a', 'b',]
    public List<Character> duplicateCharacters(List<Character> list){
        Set<Character> set = new HashSet<>();

        List<Character> result = new ArrayList<>();

        list.forEach(c -> {
            if(set.contains(c) && !result.contains(c)){
                result.add(c);
            }else {
                set.add(c);
            }
        });

        return result;
    }
}
