//package Leetcode.438. Find All Anagrams in a String;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int map[] = new int[26];
        for (int i = 0; i < p.length(); i++)
            map[p.charAt(i) - 'a']--;

        int start = 0;
        int wSize = p.length();
        for (int e = 0; e < s.length(); e++) {
            map[s.charAt(e) - 'a']++;
            if (e - start + 1 == wSize) {
                boolean allZero = true;
                for (int i = 0; i < 26; i++) {
                    if (map[i] != 0)
                        allZero = false;
                }
                if (allZero)
                    ans.add(start);

                map[s.charAt(start) - 'a']--;
                start++;
            }
        }
        return ans;
    }
}
