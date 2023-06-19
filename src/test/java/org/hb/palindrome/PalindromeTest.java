package org.hb.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void itShouldPalindrome() {
        // Given
        String str = "abba";
        boolean expected = true;
        // When
        Palindrome palindrome = new Palindrome();
        // Then
        assertEquals(expected, palindrome.palindrome(str));
    }

    @Test
    void itShouldNotBePalindrome() {
        // Given
        String str = "abcd";
        boolean expected = false;
        // When
        Palindrome palindrome = new Palindrome();
        // Then
        assertEquals(expected, palindrome.palindrome(str));
    }
}