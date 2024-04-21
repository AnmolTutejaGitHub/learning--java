//package Leetcode.46. Permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, ans);
        return ans;
    }

    public void helper(int idx, int[] arr, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            ans.add(list);
        }

        for (int i = idx; i < arr.length; i++) {
            swap(i, idx, arr);
            helper(idx + 1, arr, ans);
            swap(i, idx, arr);
        }
    }

    public void swap(int i, int idx, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
