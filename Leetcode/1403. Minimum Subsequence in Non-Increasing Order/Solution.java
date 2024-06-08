//package Leetcode.1403. Minimum Subsequence in Non-Increasing Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        for (int i : nums)
            sum += i;

        int currSum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            currSum += nums[i];
            ls.add(nums[i]);
            if (currSum > sum - currSum)
                return ls;
        }

        return ls;
    }
}
