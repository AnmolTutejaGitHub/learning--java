//package Leetcode.389. Find the Difference;

class Solution {
    public char findTheDifference(String s, String t) {
        int ascii_s = 0;
        int ascii_t = 0;
        for (int i = 0; i < t.length(); i++) {
            ascii_t += t.charAt(i);
            if (i < s.length())
                ascii_s += s.charAt(i);
        }
        return (char) (ascii_t - ascii_s);
    }
}
