//package Leetcode.1609. Even Odd Tree;
// 

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
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            TreeNode prev = null;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                if (prev == null && level % 2 != 0 && curr.val % 2 != 0)
                    return false;
                else if (prev == null && level % 2 == 0 && curr.val % 2 == 0)
                    return false;
                if (level % 2 != 0 && prev != null) {
                    if (curr.val % 2 != 0 || prev.val <= curr.val)
                        return false;
                }
                if (level % 2 == 0 && prev != null) {
                    if (curr.val % 2 == 0 || prev.val >= curr.val)
                        return false;
                }
                prev = curr;
            }
            level++;
        }
        return true;
    }
}
