// package Leetcode.3075. Maximize Happiness of Selected Children;

import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int i = happiness.length - 1;
        int pass = 0;

        while (k > 0 && i >= 0) {
            if (happiness[i] - pass > 0)
                sum += happiness[i--] - pass;
            pass++;
            k--;
        }

        return sum;
    }
}
