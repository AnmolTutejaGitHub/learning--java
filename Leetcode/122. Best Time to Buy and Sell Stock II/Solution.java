//package Leetcode.122. Best Time to Buy and Sell Stock II;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(i-1>=0 && prices[i]>prices[i-1]) profit+=prices[i]-prices[i-1];
        }
        return profit;
    }
}