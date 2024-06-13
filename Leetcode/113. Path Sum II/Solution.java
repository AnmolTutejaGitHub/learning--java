//package Leetcode.113. Path Sum II;

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        DFS(root, targetSum, new ArrayList<Integer>(), res);
        return res;
    }

    public void DFS(TreeNode node, int target, ArrayList<Integer> curr, List<List<Integer>> res) {
        if (node == null)
            return;
        if (node != null && node.left == null && node.right == null) {
            if (target - node.val == 0) {
                curr.add(node.val);
                res.add(new ArrayList<>(curr));
                curr.remove(curr.size() - 1);
            }
            return;
        }

        curr.add(node.val);
        DFS(node.left, target - node.val, curr, res);
        DFS(node.right, target - node.val, curr, res);
        curr.remove(curr.size() - 1);
    }
}
