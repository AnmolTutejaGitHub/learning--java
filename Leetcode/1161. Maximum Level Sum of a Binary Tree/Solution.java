//package Leetcode.1161. Maximum Level Sum of a Binary Tree;

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
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            level++;
            int sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                sum += curr.val;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
}
