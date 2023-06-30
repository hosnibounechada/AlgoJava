package org.hb.uniquecharacter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharacterExtractorTest {
    @Test
    void itShouldReturnCharactersWithoutDuplicates() {
        // Given
        String str = "abccba";
        List<Character> expectedResult = List.of('a', 'b', 'c');
        // When
        UniqueCharacterExtractor uce = new UniqueCharacterExtractor();
        List<Character> result = uce.removeDuplicateCharacters(str);
        // Then
        assertEquals(expectedResult.size(), result.size());
        for(int i = 0; i < result.size(); i ++){
            assertTrue(result.contains(expectedResult.get(i)));
        }
    }
}