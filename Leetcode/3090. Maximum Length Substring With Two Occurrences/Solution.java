//package Leetcode.3090. Maximum Length Substring With Two Occurrences;

import java.util.HashMap;

class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int MaxLen = 0;

        int start = 0;
        for (int e = 0; e < s.length(); e++) {
            map.put(s.charAt(e), map.getOrDefault(s.charAt(e), 0) + 1);

            while (start < e && map.get(s.charAt(e)) > 2) {
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                if (map.getOrDefault(s.charAt(start), 0) == 0)
                    map.remove(s.charAt(start));
                start++;
            }

            MaxLen = Math.max(MaxLen, e - start + 1);
        }
        return MaxLen;
    }
}
