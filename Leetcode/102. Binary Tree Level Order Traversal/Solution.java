// package Leetcode.102. Binary Tree Level Order Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        if (root == null)
            return list;
        while (!queue.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null)
                    queue.add(queue.peek().left);
                if (queue.peek().right != null)
                    queue.add(queue.peek().right);

                sublist.add(queue.remove().val);
            }

            list.add(sublist);
        }
        return list;
    }
}
