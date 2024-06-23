//package Leetcode.530. Minimum Absolute Difference in BST;

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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        DFS(root, inorder);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < inorder.size(); i++) {
            min = Math.min(min, inorder.get(i) - inorder.get(i - 1));
        }
        return min;
    }

    public void DFS(TreeNode root, ArrayList<Integer> inorder) {
        if (root == null)
            return;

        DFS(root.left, inorder);
        inorder.add(root.val);
        DFS(root.right, inorder);
    }
}
