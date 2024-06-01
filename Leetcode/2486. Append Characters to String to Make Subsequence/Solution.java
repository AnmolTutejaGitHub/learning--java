//package Leetcode.2486. Append Characters to String to Make Subsequence;

class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0;

        int ptrs = 0;
        int ptrt = 0;

        while (ptrs < s.length() && ptrt < t.length()) {
            if (s.charAt(ptrs) != t.charAt(ptrt))
                ptrs++;
            else if (s.charAt(ptrs) == t.charAt(ptrt)) {
                ptrs++;
                ptrt++;
                count++;
            }
        }
        return t.length() - count;
    }
}
