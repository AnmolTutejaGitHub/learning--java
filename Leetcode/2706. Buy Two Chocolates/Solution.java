//package Leetcode.2706. Buy Two Chocolates;

class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                secondMin = min;
                min = prices[i];
                prices[i] = Integer.MAX_VALUE;
            }
            // int currMin = prices[i];
            else if (prices[i] < secondMin)
                secondMin = prices[i];

            // eliminate
            // prices[i]=Integer.MAX_VALUE;
        }
        if (min + secondMin > money)
            return money;
        if (min + secondMin < money)
            return money - (min + secondMin);

        return 0;
    }
}
