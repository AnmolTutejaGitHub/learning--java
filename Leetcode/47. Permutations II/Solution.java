//package Leetcode.47. Permutations II;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        helper(0, nums, set);
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> ls : set)
            ans.add(ls);

        return ans;
    }

    public void helper(int idx, int[] arr, Set<List<Integer>> set) {
        if (idx == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++)
                list.add(arr[i]);
            set.add(list);
        }

        for (int i = idx; i < arr.length; i++) {
            swap(i, idx, arr);
            helper(idx + 1, arr, set);
            swap(i, idx, arr);
        }
    }

    public void swap(int i, int idx, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
