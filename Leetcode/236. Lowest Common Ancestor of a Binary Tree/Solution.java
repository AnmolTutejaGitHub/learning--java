//package Leetcode.236. Lowest Common Ancestor of a Binary Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return DFS(root, p, q);
    }

    public TreeNode DFS(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null)
            return null;

        if (node == p || node == q)
            return node;

        TreeNode l = DFS(node.left, p, q);
        TreeNode r = DFS(node.right, p, q);

        if (l == null)
            return r;
        else if (r == null)
            return l;
        else
            return node;
    }
}
