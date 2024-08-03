//package Leetcode.814. Binary Tree Pruning;
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
    public TreeNode pruneTree(TreeNode root) {
        return del(root);
    }

    public TreeNode del(TreeNode root) {
        if (root == null)
            return null;

        root.left = del(root.left);
        root.right = del(root.right);

        if (root.left == null && root.right == null && root.val == 0)
            return null;
        return root;
    }
}
