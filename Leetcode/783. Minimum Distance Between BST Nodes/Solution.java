// package Leetcode.783. Minimum Distance Between BST Nodes;

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
    public int minDiffInBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        dfs(root, inorder);
        for (int i = 1; i < inorder.size(); i++)
            min = Math.min(inorder.get(i) - inorder.get(i - 1), min);
        return min;
    }

    public void dfs(TreeNode root, List<Integer> inorder) {
        if (root == null)
            return;

        dfs(root.left, inorder);
        inorder.add(root.val);
        dfs(root.right, inorder);
    }
}