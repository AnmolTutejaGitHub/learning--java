//package Leetcode.121. Best Time to Buy and Sell Stock;

class Solution {
    public int maxProfit(int[] prices) {

        int spike = 0;
        int start = 0;

        for (int i = 0; i < prices.length; i++) {
            if (spike == 0) {
                if (i + 1 < prices.length && prices[i + 1] - prices[i] > 0) {
                    spike = prices[i + 1] - prices[i];
                    start = prices[i];
                }
            }
            if (spike != 0) {
                if (prices[i] < start)
                    start = prices[i];
                if (prices[i] - start > spike)
                    spike = prices[i] - start;
            }
        }
        return spike;
    }
}
