//package Leetcode.103. Binary Tree Zigzag Level Order Traversal;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> rootLevel = new ArrayList<>();
        rootLevel.add(root.val);
        res.add(rootLevel);
        int count = 0;
        while (!q.isEmpty()) {
            count++;
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                    ls.add(q.peek().left.val);
                }

                if (q.peek().right != null) {
                    q.add(q.peek().right);
                    ls.add(q.peek().right.val);
                }
                q.remove();
            }
            if (ls.size() != 0) {
                if (count % 2 != 0)
                    Collections.reverse(ls);
                res.add(ls);
            }
        }
        return res;
    }
}