//package Leetcode.2342. Max Sum of a Pair With Equal Sum of Digits;

import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // digits sum,index
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            int digitSum = getDigitsSum(nums[i]);
            if (map.containsKey(digitSum)) {
                int val = map.get(digitSum);
                map.put(digitSum, Math.max(val, nums[i]));
                max = Math.max(max, val + nums[i]);
            } else {
                map.put(digitSum, nums[i]);
            }
        }
        return max;
    }

    static int getDigitsSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}
