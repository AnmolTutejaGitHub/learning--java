//package Leetcode.1261. Find Elements in a Contaminated Binary Tree;

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

class FindElements {

    HashSet<Integer> set;

    public FindElements(TreeNode root) {
        root.val = 0;
        this.set = new HashSet<>();
        dfs(root);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return;

        int val = root.val;
        set.add(val);

        if (root.left != null) {
            root.left.val = 2 * val + 1;
            dfs(root.left);
        }

        if (root.right != null) {
            root.right.val = 2 * val + 2;
            dfs(root.right);
        }
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */