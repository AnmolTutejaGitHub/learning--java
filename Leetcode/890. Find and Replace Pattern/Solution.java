//package Leetcode.890. Find and Replace Pattern;

import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isIsomorphic(words[i], pattern))
                ls.add(words[i]);
        }
        return ls;
    }

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if ((mapST.containsKey(c1) && mapST.get(c1) != c2) ||
                    (mapTS.containsKey(c2) && mapTS.get(c2) != c1))
                return false;

            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }
        return true;
    }
}
