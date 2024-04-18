//package Leetcode.90. Subsets II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(0, nums, list, set);

        for (List<Integer> ls : set) {
            res.add(ls);
        }

        return res;
    }

    public void helper(int idx, int[] arr, List<Integer> list, HashSet<List<Integer>> set) {
        if (idx == arr.length) {
            set.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[idx]);
        helper(idx + 1, arr, list, set);
        list.remove(list.size() - 1);
        helper(idx + 1, arr, list, set);
    }
}
