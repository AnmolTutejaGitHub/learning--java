//package Leetcode.424. Longest Repeating Character Replacement;

class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxfreq = 0;
        int maxLen = 0;
        int start = 0;

        for (int e = 0; e < s.length(); e++) {
            freq[s.charAt(e) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(e) - 'A']);
            while (e - start + 1 - maxfreq > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            maxfreq = 0;
            for (int i = 0; i < 26; i++)
                maxfreq = Math.max(maxfreq, freq[i]);

            maxLen = Math.max(maxLen, e - start + 1);
        }
        return maxLen;
    }
}
