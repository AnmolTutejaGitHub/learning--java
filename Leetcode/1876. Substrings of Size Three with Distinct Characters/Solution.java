//package Leetcode.1876. Substrings of Size Three with Distinct Characters;

import java.util.HashMap;

class Solution {
    public int countGoodSubstrings(String s) {
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);

            if (end - start + 1 == 3) {
                if (map.size() == 3)
                    count++;
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                if (map.get(s.charAt(start)) == 0)
                    map.remove(s.charAt(start));
                start++;
            }
        }
        return count;
    }
}
