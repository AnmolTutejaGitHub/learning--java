//package Leetcode.2938. Separate Black and White Balls;

class Solution {
    public long minimumSteps(String s) {
        long count_1 = 0;
        long swaps = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                count_1++;
            else
                swaps += count_1;
        }
        return swaps;
    }
}
