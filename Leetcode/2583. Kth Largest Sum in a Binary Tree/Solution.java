//package Leetcode.2583. Kth Largest Sum in a Binary Tree;

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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((p1, p2) -> Long.compare(p2, p1));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                sum += curr.val;
            }
            pq.add(sum);
        }
        if (pq.size() < k)
            return -1;

        int count = 0;
        long res = -1;
        while (!pq.isEmpty() && count < k) {
            res = pq.poll();
            count++;
        }
        return res;
    }
}