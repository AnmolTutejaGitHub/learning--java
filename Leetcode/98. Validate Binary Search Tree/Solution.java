//package Leetcode.98. Validate Binary Search Tree;

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
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean dfs(TreeNode node, long min, long max) {
        if (node == null)
            return true;
        if (node.val >= max)
            return false;
        if (node.val <= min)
            return false;

        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }
}
