// package Leetcode.993. Cousins in Binary Tree;

import java.util.LinkedList;
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
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] xh = new int[1];
        int[] yh = new int[1];
        int[] xparent = new int[1];
        int[] yparent = new int[1];
        BFS(root, xh, x, xparent);
        BFS(root, yh, y, yparent);

        return ((xh[0] - yh[0]) == 0 && xparent[0] != yparent[0]);
    }

    public void BFS(TreeNode root, int[] h, int val, int[] parent) {
        Queue<TreeNode> q = new LinkedList<>();
        h[0]++;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {

                if (q.peek().left != null) {
                    q.add(q.peek().left);
                    if (q.peek().left.val == val) {
                        parent[0] = q.peek().val;
                        return;
                    }
                }

                if (q.peek().right != null) {
                    q.add(q.peek().right);
                    if (q.peek().right.val == val) {
                        parent[0] = q.peek().val;
                        return;
                    }
                }

                q.remove();
            }
            h[0]++;
        }
    }
}
