//package Leetcode.18. 4Sum;

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4)
            return res;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            while (j < nums.length) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        k++;
                        continue;
                    }
                    if (l + 1 < nums.length && nums[l] == nums[l + 1]) {
                        l--;
                        continue;
                    }

                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum > target)
                        l--;
                    else if (sum < target)
                        k++;
                    else {
                        ArrayList<Integer> curr = new ArrayList<>();
                        curr.add(nums[i]);
                        curr.add(nums[j]);
                        curr.add(nums[k]);
                        curr.add(nums[l]);
                        res.add(curr);
                        k++;
                        l--;
                    }
                }
                j++;
            }
        }
        return res;
    }
}
