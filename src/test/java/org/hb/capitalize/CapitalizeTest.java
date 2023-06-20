package org.hb.capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTest {

    @Test
    void itShouldCapitalize() {
        // Given
        String str = "hi there, how is it going?";
        String expected = "Hi There, How Is It Going?";
        // When
        Capitalize capitalize = new Capitalize();
        // Then
        assertEquals(expected, capitalize.capitalize(str));
    }

    @Test
    void itShouldCapitalizeWithRegex() {
        // Given
        String str = "i love breakfast at bill miller bbq";
        String expected = "I Love Breakfast At Bill Miller Bbq";
        // When
        Capitalize capitalize = new Capitalize();
        // Then
        assertEquals(expected, capitalize.capitalizeWithRegex(str));
    }
}