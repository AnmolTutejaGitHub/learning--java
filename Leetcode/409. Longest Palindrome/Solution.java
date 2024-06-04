//package Leetcode.409. Longest Palindrome;

class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[128];
        int count = 0;
        boolean odd = false;
        for (char ch : s.toCharArray())
            freq[ch]++;

        for (int f : freq) {
            if (f % 2 == 0)
                count += f;
            else if (f % 2 != 0) {
                count += f - 1;
                odd = true;
            }
        }
        if (odd)
            return count + 1;

        return count;
    }
}
