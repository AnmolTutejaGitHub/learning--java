//package Leetcode.2496. Maximum Value of a String in an Array;

class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                try {
                    if (Integer.parseInt(str) > max) {
                        max = Integer.parseInt(str);
                    }
                } catch (NumberFormatException e) {
                    if (str.length() > max)
                        max = str.length();
                }

            }
        }
        return max;
    }
}
