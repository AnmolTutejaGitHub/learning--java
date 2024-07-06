//package Leetcode.15. 3Sum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (j < i && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                if (k + 1 < nums.length && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] == 0) {
                    ArrayList<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(nums[k]);
                    ans.add(curr);
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}