//package Leetcode.1448. Count Good Nodes in Binary Tree;

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
    public int goodNodes(TreeNode root) {
        int count[] = new int[1];
        dfs(root, Integer.MIN_VALUE, count);
        return count[0];
    }

    public void dfs(TreeNode node, int pathmax, int count[]) {
        if (node == null)
            return;

        if (pathmax <= node.val)
            count[0]++;
        pathmax = Math.max(node.val, pathmax);
        dfs(node.left, pathmax, count);
        dfs(node.right, pathmax, count);
    }
}
