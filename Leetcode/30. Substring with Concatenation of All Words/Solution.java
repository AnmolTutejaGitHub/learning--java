//package Leetcode.30. Substring with Concatenation of All Words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ls = new ArrayList<>();
        int ws = words[0].length() * words.length;
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map1.put(words[i], map1.getOrDefault(words[i], 0) + 1);
        }

        int start = 0;
        StringBuilder currSb = new StringBuilder();
        for (int e = 0; e < s.length(); e++) {
            currSb.append(s.charAt(e));
            if (e - start + 1 == ws) {
                HashMap<String, Integer> map2 = new HashMap<>();
                for (int i = 0; i < currSb.length(); i += words[0].length()) {
                    String curr = currSb.substring(i, i + words[0].length()).toString();
                    map2.put(curr, map2.getOrDefault(curr, 0) + 1);
                }

                if (map1.equals(map2)) {
                    ls.add(start);
                }
                currSb.deleteCharAt(0);
                start++;
            }
        }
        return ls;
    }
}