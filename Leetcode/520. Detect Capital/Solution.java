//package Leetcode.520. Detect Capital;

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;

        return false;
    }
}
