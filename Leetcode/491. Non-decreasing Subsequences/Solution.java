//package Leetcode.491. Non-decreasing Subsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        helper(0, nums, new ArrayList<>(), ans);

        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> ls : ans)
            res.add(ls);
        return res;
    }

    public void helper(int idx, int[] nums, List<Integer> list, Set<List<Integer>> ans) {
        if (idx == nums.length) {
            if (list.size() >= 2)
                ans.add(new ArrayList<>(list));
            return;
        }

        if (list.size() == 0) {
            list.add(nums[idx]);
            helper(idx + 1, nums, list, ans);
            list.remove(list.size() - 1);
        } else if (nums[idx] >= list.get(list.size() - 1)) {
            list.add(nums[idx]);
            helper(idx + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }

        helper(idx + 1, nums, list, ans);
    }
}
