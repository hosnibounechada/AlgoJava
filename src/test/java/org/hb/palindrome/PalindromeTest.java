package org.hb.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void itShouldPalindrome() {
        // Given
        String str = "abba";
        // When
        Palindrome palindrome = new Palindrome();
        // Then
        assertTrue(palindrome.palindrome(str));
    }

    @Test
    void itShouldNotBePalindrome() {
        // Given
        String str = "abcd";
        // When
        Palindrome palindrome = new Palindrome();
        // Then
        assertFalse(palindrome.palindrome(str));
    }
}