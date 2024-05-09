// package Leetcode.872. Leaf-Similar Trees;

import java.util.ArrayList;

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        DFS(root1, l1);
        DFS(root2, l2);

        return l1.equals(l2);

    }

    public void DFS(TreeNode node, ArrayList<Integer> list) {
        if (node != null && node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        if (node != null)
            DFS(node.left, list);
        if (node != null)
            DFS(node.right, list);
    }
}
