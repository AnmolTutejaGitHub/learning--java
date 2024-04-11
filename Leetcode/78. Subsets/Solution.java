//package Leetcode.78. Subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        helper(nums, set, 0, res);
        return res;
    }

    public void helper(int[] nums, List<Integer> set, int i, List<List<Integer>> res) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[i]);
        helper(nums, set, i + 1, res);
        set.remove(set.size() - 1);
        helper(nums, set, i + 1, res);
    }

}