//package Leetcode.230. Kth Smallest Element in a BST;

import java.util.PriorityQueue;

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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        DFS(root, pq);

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.peek();
    }

    public void DFS(TreeNode node, PriorityQueue<Integer> pq) {
        if (node == null)
            return;

        pq.add(node.val);
        DFS(node.left, pq);
        DFS(node.right, pq);
    }

}
