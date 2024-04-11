//package Leetcode.39. Combination Sum;

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        if (candidates.length == 0)
            return res;

        helper(0, target, candidates, list, res);
        return res;
    }

    public void helper(int idx, int target, int[] arr, ArrayList<Integer> list, List<List<Integer>> res) {
        if (idx == arr.length) {
            if (target == 0)
                res.add(new ArrayList<>(list));
            return;
        }

        if (arr[idx] <= target) {
            list.add(arr[idx]);
            helper(idx, target - arr[idx], arr, list, res);
            if (list.size() > 0)
                list.remove(list.size() - 1);
        }
        helper(idx + 1, target, arr, list, res);
    }
}
