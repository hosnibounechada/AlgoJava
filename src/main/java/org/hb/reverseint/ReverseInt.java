package org.hb.reverseint;

public class ReverseInt {
    // --- Directions
    // Given an integer, return an integer that is the reverse
    // ordering of numbers.
    // --- Examples
    //   reverseInt(15) === 51
    //   reverseInt(981) === 189
    //   reverseInt(500) === 5
    //   reverseInt(-15) === -51
    //   reverseInt(-90) === -9
    public int reverseInt(int value) {
        int sign = value > 0 ? 1 : -1;

        StringBuilder sb = new StringBuilder(String.valueOf(value * sign)).reverse();

        return Integer.parseInt(new String(sb)) * sign;
    }
}
