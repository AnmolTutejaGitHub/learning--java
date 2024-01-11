//package Leetcode.2185. Counting Words With a Given Prefix;

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= pref.length()) {
                String prefix = word.substring(0, pref.length());
                if (prefix.contains(pref))
                    count++;
            }
        }
        return count;
    }
}