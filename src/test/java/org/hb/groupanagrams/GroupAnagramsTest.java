package org.hb.groupanagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void itShouldGroupAnagrams() {
        // Given
        List<List<String>> expectedResult = List.of(
                List.of("tea", "ate", "eat"),
                List.of("tan", "nat"),
                List.of("bat")
        );

        String[] strs = {"tea", "ate", "eat", "tan", "nat", "bat"};

        // When
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        // Then
        assertEquals(expectedResult.size(), result.size());

        for(int i = 0; i < result.size(); i++){
            for(int j = 0; j < result.get(i).size(); j++){
                assertEquals(expectedResult.get(i).get(j), result.get(i).get(j));
            }
        }
    }
}