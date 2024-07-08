//package Leetcode.1833. Maximum Ice Cream Bars;

import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        int i = 0;
        while (i < costs.length && costs[i] <= coins) {
            count++;
            coins -= costs[i];
            i++;
        }
        return count;
    }
}
