//package Leetcode.1941. Check if All Characters Have Equal Number of Occurrences;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int map[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }

        boolean check = true;
        int num = 0;
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0 && check) {
                num = map[i];
                check = false;
            }

            if (num != 0 && map[i] != 0) {
                if (map[i] != num)
                    return false;
            }
        }

        return true;
    }
}
