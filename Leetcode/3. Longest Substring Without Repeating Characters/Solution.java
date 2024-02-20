//package Leetcode.3. Longest Substring Without Repeating Characters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int finalMax = 0;
        for (int i = 0; i < s.length(); i++) {
            int cycleMax = 1;
            int j = i;
            String substring = "";
            while (j + 1 != s.length() && s.charAt(j) != s.charAt(j + 1) && !substring.contains("" + s.charAt(j + 1))) {
                substring += "" + s.charAt(j);
                cycleMax++;
                j++;
            }

            if (cycleMax > finalMax)
                finalMax = cycleMax;
        }

        if (finalMax == 0 && s.length() != 0)
            return 1;
        return finalMax;
    }
}
