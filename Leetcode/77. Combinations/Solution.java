//package Leetcode.77. Combinations;

import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1, n, k, ans, curr);
        return ans;
    }

    public void backtrack(int idx, int n, int k, List<List<Integer>> ans, List<Integer> curr) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (idx > n)
            return;

        curr.add(idx);
        backtrack(idx + 1, n, k, ans, curr);
        curr.remove(curr.size() - 1);
        backtrack(idx + 1, n, k, ans, curr);
    }
}
