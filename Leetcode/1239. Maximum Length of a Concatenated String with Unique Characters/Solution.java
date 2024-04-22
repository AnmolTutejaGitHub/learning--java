//package Leetcode.1239. Maximum Length of a Concatenated String with Unique Characters;

import java.util.*;

class Solution {
    public int maxLength(List<String> arr) {
        int max[] = new int[1];
        helper(0, arr, "", max);
        return max[0];
    }

    public void helper(int idx, List<String> arr, String str, int[] max) {
        if (idx == arr.size()) {
            if (isUnique(str))
                max[0] = Math.max(str.length(), max[0]);
            return;
        }

        helper(idx + 1, arr, str + arr.get(idx), max);
        helper(idx + 1, arr, str, max);
    }

    public boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();

        for (Character s : str.toCharArray()) {
            set.add(s);
        }
        return set.size() == str.length();
    }
}
