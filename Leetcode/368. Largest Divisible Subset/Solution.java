//package Leetcode.368. Largest Divisible Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int[] prev = new int[n];
        Arrays.fill(prev, -1);

        for (int i=0; i<n;i++) {
            int max = 0;
            int maxIdx = -1;
            for (int j=i-1;j>=0;j--) {
                if((nums[i] % nums[j]==0) && dp[j]>max) {
                    max = dp[j];
                    maxIdx = j;
                }
            }
            dp[i] = 1 + max;
            prev[i] = maxIdx;
        }

        int max = 0;
        int maxi = 0;
        for (int i=0;i<n;i++) {
            if (dp[i] > max) {
                max = dp[i];
                maxi = i;
            }
        }

        while (maxi != -1) {
            res.add(nums[maxi]);
            maxi = prev[maxi];
        }

        return res;
    }
}
