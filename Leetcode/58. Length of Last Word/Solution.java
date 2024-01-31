//package Leetcode.58. Length of Last Word;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split("\\s+");

        return str[str.length - 1].length();

    }
}
