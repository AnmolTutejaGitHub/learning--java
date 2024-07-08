//package Leetcode.16. 3Sum Closest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            int sum = 0;
            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                if (k + 1 < nums.length && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                sum = nums[i] + nums[j] + nums[k];
                if (sum > target) {
                    k--;
                } else if (sum == target)
                    return target;
                else if (sum < target) {
                    j++;
                }
                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    res = sum;
                }
            }
        }
        return res;
    }
}
