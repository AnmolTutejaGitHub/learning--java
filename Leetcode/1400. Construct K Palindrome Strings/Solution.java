//package Leetcode.1400. Construct K Palindrome Strings;

class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k)
            return false;
        int map[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0 && map[i] % 2 != 0)
                count++;
        }
        return count <= k;
    }
}