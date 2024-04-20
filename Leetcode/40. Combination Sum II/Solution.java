//package Leetcode.40. Combination Sum II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, candidates, new ArrayList<>(), res);
        return res;
    }

    public void helper(int idx, int target, int[] arr, ArrayList<Integer> list, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;

            list.add(arr[i]);
            helper(i + 1, target - arr[i], arr, list, res);
            list.remove(list.size() - 1);
        }
    }

}
