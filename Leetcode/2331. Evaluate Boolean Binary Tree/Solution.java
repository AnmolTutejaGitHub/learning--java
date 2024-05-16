// package Leetcode.2331. Evaluate Boolean Binary Tree;
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
    public boolean evaluateTree(TreeNode root) {
        return DFS(root);
    }

    public boolean DFS(TreeNode node) {
        if (node.val == 0)
            return false;
        if (node.val == 1)
            return true;

        if (node.val == 2)
            return DFS(node.left) || DFS(node.right);
        if (node.val == 3)
            return DFS(node.left) && DFS(node.right);

        return true;
    }
}
