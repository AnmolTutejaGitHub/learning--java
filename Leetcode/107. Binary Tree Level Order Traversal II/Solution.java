//package Leetcode.107. Binary Tree Level Order Traversal II;

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return res;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> curr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.remove();
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);

                curr.add(cur.val);
            }
            res.add(curr);
        }

        return reverse(res);
    }

    public List<List<Integer>> reverse(List<List<Integer>> res) {
        List<List<Integer>> temp = new ArrayList<>();
        for (int i = res.size() - 1; i >= 0; i--) {
            temp.add(res.get(i));
        }
        return temp;
    }
}
