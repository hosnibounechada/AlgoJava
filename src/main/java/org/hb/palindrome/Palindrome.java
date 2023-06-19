package org.hb.palindrome;

public class Palindrome {
    // --- Directions
    // Given a string, return true if the string is a palindrome
    // or false if it is not.  Palindromes are strings that
    // form the same word if it is reversed. *Do* include spaces
    // and punctuation in determining if the string is a palindrome.
    // --- Examples:
    //   palindrome("abba") === true
    //   palindrome("abcdefg") === false

    public boolean palindrome(String str){
        char[] arr = str.toCharArray();
        boolean isPalidrome = true;

        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - i - 1) break;

            if (arr[i] != arr[arr.length - i - 1]) {
                isPalidrome = false;
                break;
            }
        }
        return isPalidrome;
    }
}
