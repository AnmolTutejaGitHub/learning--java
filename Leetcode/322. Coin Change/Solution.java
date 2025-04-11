//package Leetcode.322. Coin Change;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp = new int[amount+1];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<dp.length) {
            dp[coins[i]] = 1;
            min  = Math.min(dp[coins[i]],min);
            }
        }

        for(int i=0;i<=amount;i++){
            if(i<min) {
                dp[i] = -1;
                continue;
            }

            if(dp[i]!=0) continue;

            int mincoins = Integer.MAX_VALUE;

            for(int j=0;j<coins.length;j++){
                if(i-coins[j] >=0 && dp[i-coins[j]]>0) {
                    mincoins = Math.min(mincoins,dp[i-coins[j]]);
                }
            }
            if(mincoins!=Integer.MAX_VALUE) dp[i] = mincoins+1;
            else dp[i] = -1;
        }
        return dp[amount];
    }
}