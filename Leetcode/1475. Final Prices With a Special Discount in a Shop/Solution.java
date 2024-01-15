//package Leetcode.1475. Final Prices With a Special Discount in a Shop;

class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                // if(i==prices.length-1) ans[i]= prices[i];
                if (j > i && prices[j] <= prices[i]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                } else
                    ans[i] = prices[i];
                // System.out.println(i+" "+j+" "+ans[i]);
            }

            // why the fuck is ans[prices.length-1] ==0
            ans[prices.length - 1] = prices[prices.length - 1];
        }
        return ans;
    }
}
