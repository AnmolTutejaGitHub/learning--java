//package Leetcode.863. All Nodes Distance K in Binary Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        get_parents(root, parent);

        Queue<TreeNode> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(target);
        visited.add(target.val);
        int dis = 0;
        while (!q.isEmpty()) {
            if (dis == k)
                break;
            dis++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null && !visited.contains(curr.left.val)) {
                    q.add(curr.left);
                    visited.add(curr.left.val);
                }

                if (curr.right != null && !visited.contains(curr.right.val)) {
                    q.add(curr.right);
                    visited.add(curr.right.val);
                }

                if (parent.get(curr) != null && !visited.contains(parent.get(curr).val)) {
                    q.add(parent.get(curr));
                    visited.add(parent.get(curr).val);
                }
            }
        }

        while (!q.isEmpty())
            res.add(q.poll().val);
        return res;
    }

    public void get_parents(TreeNode root, Map<TreeNode, TreeNode> parent) {
        if (root == null)
            return;

        if (root.left != null) {
            parent.put(root.left, root);
            get_parents(root.left, parent);
        }

        if (root.right != null) {
            parent.put(root.right, root);
            get_parents(root.right, parent);
        }
    }
}
