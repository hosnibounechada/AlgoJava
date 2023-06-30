package org.hb.duplicates;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateCharactersTest {

    @Test
    void itShouldReturnOnlyDuplicateCharacters() {
        // Given
        List<Character> list = List.of('a', 'b', 'a', 'c', 'a', 'b');
        List<Character> expectedResult = List.of('a', 'b');

        // When
        DuplicateCharacters dc = new DuplicateCharacters();
        List<Character> result = dc.duplicateCharacters(list);

        // Then
        assertEquals(expectedResult.size(), result.size());
        for(int i = 0; i < result.size(); i ++){
            assertTrue(result.contains(expectedResult.get(i)));
        }
    }
}