//package Leetcode.1339. Maximum Product of Splitted Binary Tree;

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
    public int maxProduct(TreeNode root) {

        int totalsum = sum(root);

        long max[] = new long[1];
        dfs(root, totalsum, max);

        int M = 1000000007;
        return (int) (max[0] % M);
    }

    public long dfs(TreeNode root, int totalsum, long[] max) {
        if (root == null)
            return 0;

        long l = dfs(root.left, totalsum, max);
        long r = dfs(root.right, totalsum, max);

        long c1 = (totalsum - l) * l;
        long c2 = (totalsum - r) * r;

        max[0] = Math.max(max[0], Math.max(c1, c2));

        return root.val + l + r;
    }

    public int sum(TreeNode root) {
        if (root == null)
            return 0;

        return root.val + sum(root.left) + sum(root.right);
    }
}