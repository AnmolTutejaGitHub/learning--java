//package Leetcode.938. Range Sum of BST;

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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum[] = new int[1];
        dfs(root, low, high, sum);
        return sum[0];
    }

    public void dfs(TreeNode root, int l, int h, int[] sum) {
        if (root == null)
            return;

        if (root.val >= l && root.val <= h)
            sum[0] += root.val;

        if (root.val > l)
            dfs(root.left, l, h, sum);
        if (root.val < h)
            dfs(root.right, l, h, sum);
    }
}
