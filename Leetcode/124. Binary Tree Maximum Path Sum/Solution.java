//package Leetcode.124. Binary Tree Maximum Path Sum;

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
    public int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        DFS(root, max);
        return max[0];
    }

    public int DFS(TreeNode node, int[] max) {
        if (node == null)
            return 0;

        int ls = Math.max(0, DFS(node.left, max));
        int rs = Math.max(0, DFS(node.right, max));
        max[0] = Math.max(max[0], node.val + ls + rs);

        return node.val + Math.max(ls, rs);
    }
}
