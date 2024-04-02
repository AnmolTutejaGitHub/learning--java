//package Leetcode.3. Longest Substring Without Repeating Characters;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int finalMax = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int cycleMax = 1;
//             int j = i;
//             String substring = "";
//             while (j + 1 != s.length() && s.charAt(j) != s.charAt(j + 1) && !substring.contains("" + s.charAt(j + 1))) {
//                 substring += "" + s.charAt(j);
//                 cycleMax++;
//                 j++;
//             }

//             if (cycleMax > finalMax)
//                 finalMax = cycleMax;
//         }

//         if (finalMax == 0 && s.length() != 0)
//             return 1;
//         return finalMax;
//     }
// }

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int end = 0;

        while (end < s.length()) {
            if (map.containsKey(s.charAt(end)) && map.get(s.charAt(end)) >= start)
                start = map.get(s.charAt(end)) + 1;
            map.put(s.charAt(end), end);
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}
