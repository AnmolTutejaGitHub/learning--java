// package Leetcode.110. Balanced Binary Tree;

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
    public boolean isBalanced(TreeNode root) {
        return DFS(root);
    }

    public boolean DFS(TreeNode node) {
        if (node == null)
            return true;

        if (Math.abs(getHeight(node.left) - getHeight(node.right)) > 1)
            return false;

        return DFS(node.left) && DFS(node.right);
    }

    public int getHeight(TreeNode node) {
        if (node == null)
            return 0;

        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
