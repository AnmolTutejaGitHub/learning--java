//package Leetcode.1672. Richest Customer Wealth;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        // int localsum=0;
        for (int i = 0; i < accounts.length; i++) {
            int localsum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                localsum += accounts[i][j];
            }
            if (max < localsum)
                max = localsum;
        }
        return max;
    }
}
