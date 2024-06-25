//package Leetcode.1038. Binary Search Tree to Greater Sum Tree;

import java.util.*;

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
    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;
        List<TreeNode> inorder = new ArrayList<>();
        dfs(root, inorder);

        for (int i = inorder.size() - 2; i >= 0; i--) {
            inorder.get(i).val = inorder.get(i).val + inorder.get(i + 1).val;
        }

        return root;
    }

    public void dfs(TreeNode root, List<TreeNode> inorder) {
        if (root == null)
            return;

        dfs(root.left, inorder);
        inorder.add(root);
        dfs(root.right, inorder);
    }
}