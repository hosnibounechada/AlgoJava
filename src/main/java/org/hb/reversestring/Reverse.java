package org.hb.reversestring;

public class Reverse {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);

        reversed.reverse();

        return reversed.toString();
    }
}
