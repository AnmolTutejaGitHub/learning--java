//package Leetcode.965. Univalued Binary Tree;
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
    public boolean isUnivalTree(TreeNode root) {
        Boolean ans[] = new Boolean[1];
        ans[0] = true;
        DFS(root, root, ans);
        return ans[0];
    }

    public void DFS(TreeNode node, TreeNode root, Boolean[] ans) {
        if (node == null)
            return;

        DFS(node.left, root, ans);
        if (node.val != root.val)
            ans[0] = false;
        DFS(node.right, root, ans);
    }
}