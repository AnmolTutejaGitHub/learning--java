//package Leetcode.1382. Balance a Binary Search Tree;

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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        dfs(root, inorder);
        return dfs(inorder, 0, inorder.size() - 1);
    }

    public void dfs(TreeNode root, ArrayList<Integer> ls) {
        if (root == null)
            return;

        dfs(root.left, ls);
        ls.add(root.val);
        dfs(root.right, ls);
    }

    public TreeNode dfs(ArrayList<Integer> ls, int s, int e) {
        if (s > e)
            return null;
        int m = (s + e) / 2;
        TreeNode root = new TreeNode(ls.get(m));
        root.left = dfs(ls, s, m - 1);
        root.right = dfs(ls, m + 1, e);

        return root;
    }
}
