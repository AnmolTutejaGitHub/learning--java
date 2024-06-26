//package Leetcode.515. Find Largest Value in Each Tree Row;

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if (root == null)
            return ls;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.peek();
                max = Math.max(max, curr.val);

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                q.remove();
            }
            ls.add(max);
        }
        return ls;
    }
}
