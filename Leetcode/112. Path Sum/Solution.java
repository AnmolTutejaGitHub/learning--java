//package Leetcode.112. Path Sum;

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    public boolean dfs(TreeNode node, int target) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null) {
            if (target - node.val == 0)
                return true;
            return false;
        }

        return dfs(node.left, target - node.val) || dfs(node.right, target - node.val);
    }
}
