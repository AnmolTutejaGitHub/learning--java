//package Leetcode.1347. Minimum Number of Steps to Make Two Strings Anagram;

class Solution {
    public int minSteps(String s, String t) {
        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] < 0)
                count += Math.abs(freq[i]);
        }
        return count;
    }
}
