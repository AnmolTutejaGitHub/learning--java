//package Leetcode.653. Two Sum IV - Input is a BST;

import java.util.*;

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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ls = new ArrayList<>();
        dfs(root, ls);

        int s = 0;
        int e = ls.size() - 1;
        while (s < e) {
            int sum = ls.get(s) + ls.get(e);
            if (sum == k)
                return true;
            else if (sum > k)
                e--;
            else
                s++;
        }
        return false;
    }

    public void dfs(TreeNode node, List<Integer> ls) {
        if (node == null)
            return;

        dfs(node.left, ls);
        ls.add(node.val);
        dfs(node.right, ls);
    }
}
