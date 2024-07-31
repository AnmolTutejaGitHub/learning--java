//package Leetcode.2385. Amount of Time for Binary Tree to Be Infected;

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
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> parents = new HashMap<>();
        markParents(root, parents, null);

        HashSet<Integer> vis = new HashSet<>();
        TreeNode target = getTarget(root, start);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        vis.add(target.val);

        int min = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null && !vis.contains(curr.left.val)) {
                    q.add(curr.left);
                    vis.add(curr.left.val);
                }
                if (curr.right != null && !vis.contains(curr.right.val)) {
                    q.add(curr.right);
                    vis.add(curr.right.val);
                }
                if (parents.get(curr) != null && !vis.contains(parents.get(curr).val)) {
                    q.add(parents.get(curr));
                    vis.add(parents.get(curr).val);
                }
            }
            if (!q.isEmpty())
                min++;
        }
        return min;
    }

    public void markParents(TreeNode root, HashMap<TreeNode, TreeNode> parents, TreeNode parent) {
        if (root == null)
            return;

        parents.put(root, parent);
        markParents(root.left, parents, root);
        markParents(root.right, parents, root);
    }

    public TreeNode getTarget(TreeNode root, int start) {
        if (root == null)
            return null;

        if (root.val == start)
            return root;

        TreeNode left = getTarget(root.left, start);
        TreeNode right = getTarget(root.right, start);

        if (left == null)
            return right;
        else
            return left;
    }
}