//package Leetcode.49. Group Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if (map.containsKey(sorted))
                map.get(sorted).add(s);
            else {
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(sorted, ls);
            }
        }

        for (String ls : map.keySet()) {
            res.add(map.get(ls));
        }
        return res;
    }
}
