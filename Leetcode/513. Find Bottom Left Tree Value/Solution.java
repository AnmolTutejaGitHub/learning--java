// package Leetcode.513. Find Bottom Left Tree Value;

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
    public int findBottomLeftValue(TreeNode root) {
        return BFS(root);
    }

    public int BFS(TreeNode root) {
        int ans = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            boolean passed = false;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                if (!passed && q.peek().left != null) {
                    ans = q.peek().left.val;
                    passed = true;
                }

                else if (!passed && q.peek().right != null) {
                    ans = q.peek().right.val;
                    passed = true;
                }

                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);

                q.remove();
            }
        }
        return ans;
    }
}

// intution : travel level order ...update ans with each level first node
