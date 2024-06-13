//package Leetcode.226. Invert Binary Tree;
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
    public TreeNode invertTree(TreeNode root) {
        DFS(root);
        return root;
    }

    public void DFS(TreeNode node) {
        if (node == null)
            return;

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        DFS(node.left);
        DFS(node.right);
    }
}
