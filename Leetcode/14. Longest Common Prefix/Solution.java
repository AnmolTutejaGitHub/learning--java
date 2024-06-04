//package Leetcode.14. Longest Common Prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char prefix = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || prefix != strs[j].charAt(i))
                    return sb.toString();
            }
            sb.append("" + prefix);
        }
        return sb.toString();
    }
}
