//package Leetcode.1315. Sum of Nodes with Even-Valued Grandparent;

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
    public int sumEvenGrandparent(TreeNode root) {
        HashMap<TreeNode, TreeNode> parents = new HashMap<>();
        markParents(root, parents, null);
        int sum[] = new int[1];
        count(root, sum, parents);

        return sum[0];
    }

    public void count(TreeNode root, int[] sum, HashMap<TreeNode, TreeNode> parents) {
        if (root == null)
            return;

        if (grandparent(root, parents) != null && grandparent(root, parents) % 2 == 0)
            sum[0] += root.val;
        count(root.left, sum, parents);
        count(root.right, sum, parents);
    }

    public void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parents, TreeNode parent) {
        if (root == null)
            return;

        parents.put(root, parent);
        markParents(root.left, parents, root);
        markParents(root.right, parents, root);
    }

    public Integer grandparent(TreeNode node, HashMap<TreeNode, TreeNode> parents) {
        TreeNode parent = parents.get(node);
        TreeNode grandparent = parents.get(parent);
        if (grandparent == null)
            return null;

        return grandparent.val;
    }
}
