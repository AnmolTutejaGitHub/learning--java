//package Leetcode.2294. Partition Array Such That Maximum Difference Is K;

import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int s = 0;
        int e = 0;
        int count = 0;

        while (e < nums.length) {
            while (e < nums.length && nums[e] - nums[s] <= k)
                e++;
            count++;
            s = e;
            // e++;
        }
        return count;
    }
}
