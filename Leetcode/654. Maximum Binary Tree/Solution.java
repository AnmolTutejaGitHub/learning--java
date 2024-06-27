//package Leetcode.654. Maximum Binary Tree;
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    public TreeNode dfs(int[] nums, int s, int e) {
        if (s == e && e < nums.length)
            return new TreeNode(nums[s]);
        if (s >= e)
            return null;

        int max = Integer.MIN_VALUE;
        int maxInd = -1;
        for (int i = s; i <= e; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxInd = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxInd]);
        root.left = dfs(nums, s, maxInd - 1);
        root.right = dfs(nums, maxInd + 1, e);
        return root;
    }
}
