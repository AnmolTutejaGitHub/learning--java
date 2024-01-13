
//package Leetcode.2828. Check if a String Is an Acronym of Words;
import java.util.*;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String[] wordsarr = words.toArray(new String[words.size()]);

        String ans = "";
        for (int i = 0; i < wordsarr.length; i++) {
            ans += wordsarr[i].charAt(0);
        }
        return ans.equals(s);
    }
}