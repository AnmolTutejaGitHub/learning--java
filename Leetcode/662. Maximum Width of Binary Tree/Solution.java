//package Leetcode.662. Maximum Width of Binary Tree;

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

class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int i_0 = -1;
            for (int i = 0; i < size; i++) {
                if (i == 0)
                    i_0 = q.peek().index;

                if (q.peek().node.left != null)
                    q.add(new Pair(q.peek().node.left, 2 * q.peek().index + 1));
                if (q.peek().node.right != null)
                    q.add(new Pair(q.peek().node.right, 2 * q.peek().index + 2));

                max = Math.max(max, q.peek().index - i_0 + 1);
                q.remove();
            }
        }
        return max;
    }
}
