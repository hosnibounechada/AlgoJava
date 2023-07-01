package org.hb.groupanagrams;

import java.util.*;

public class GroupAnagrams {
    //    Directions
    //    Given an array of strings, group anagrams together.
    //    Example:
    //    input: ["tea", "ate", "eat", "tan", "nat", "bat"]
    //    output: [
    //              ["tea", "ate", "eat"],
    //              ["tan", "nat"],
    //              ["bat"],
    //             ]
    //    All input string will be lowercase
    //    the order of the output doesn't matter

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String sortedStr = sortString(s);

            if (!map.containsKey(sortedStr)) {
                List<String> list = new ArrayList<>();

                list.add(s);

                map.put(sortedStr, list);

                result.add(list);
            } else {
                map.get(sortedStr).add(s);
            }
        }

        return result;
    }

    private String sortString(String str) {
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }
}
