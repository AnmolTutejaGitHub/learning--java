//package Leetcode.700. Search in a Binary Search Tree;

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
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val)
                return root;
            else if (root.val < val)
                root = root.right;
            else if (root.val > val)
                root = root.left;
        }
        return root;
    }
}
