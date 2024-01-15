//package Leetcode.1550. Three Consecutive Odds;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                freq++;
            if (arr[i] % 2 == 0)
                freq = 0;
            if (freq == 3)
                return true;
        }
        return false;
    }
}
