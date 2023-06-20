package org.hb.capitalize;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capitalize {
    // --- Directions
    // Write a function that accepts a string.  The function should
    // capitalize the first letter of each word in the string then
    // return the capitalized string.
    // --- Examples
    //   capitalize('a short sentence') --> 'A Short Sentence'
    //   capitalize('a lazy fox') --> 'A Lazy Fox'
    //   capitalize('look, it is working!') --> 'Look, It Is Working!'

    public String capitalize(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");

        for (String word : words) {
            sb
                    .append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return new String(sb).trim();
    }

    public String capitalizeWithRegex(String str) {
        Pattern pattern = Pattern.compile("\\b(\\w)(\\w*)\\b");
        Matcher matcher = pattern.matcher(str);
        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase() + matcher.group(2));
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}
