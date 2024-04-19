//package Leetcode.1456. Maximum Number of Vowels in a Substring of Given Length;

class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int start = 0;
        int e = 0;
        while (e < k) {
            char ch = s.charAt(e);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
            e++;
        }

        int maxLen = count;

        for (; e < s.length(); e++) {
            char ch = s.charAt(e);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;

            char sch = s.charAt(start);
            if (sch == 'a' || sch == 'e' || sch == 'i' || sch == 'o' || sch == 'u')
                count--;
            start++;

            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
