//package Leetcode.1110. Delete Nodes And Return Forest;

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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ls = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < to_delete.length; i++)
            set.add(to_delete[i]);
        if (!set.contains(root.val))
            ls.add(root);
        dfs(root, set, ls, null);

        return ls;
    }

    public void dfs(TreeNode root, HashSet<Integer> set, List<TreeNode> ls, TreeNode parent) {
        if (root == null)
            return;

        if (set.contains(root.val)) {
            if (root.left != null && !set.contains(root.left.val))
                ls.add(root.left);
            if (root.right != null && !set.contains(root.right.val))
                ls.add(root.right);
        }

        dfs(root.left, set, ls, root);
        dfs(root.right, set, ls, root);

        if (set.contains(root.val) && parent != null) {
            if (parent.left != null && parent.left.val == root.val)
                parent.left = null;
            else
                parent.right = null;
        }
    }
}