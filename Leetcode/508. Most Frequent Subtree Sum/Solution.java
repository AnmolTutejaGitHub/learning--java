// package Leetcode.508. Most Frequent Subtree Sum;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();

        dfs(root, map);
        int max = Integer.MIN_VALUE;
        int maxcnt = 0;
        for (int num : map.values()) {
            if (num == max)
                maxcnt++;
            else if (num > max) {
                max = num;
                maxcnt = 1;
            }
        }

        int res[] = new int[maxcnt];
        int idx = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == max)
                res[idx++] = num;
        }
        return res;
    }

    public int dfs(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null)
            return 0;

        int l = dfs(root.left, map);
        int r = dfs(root.right, map);

        int sum = l + r + root.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
}