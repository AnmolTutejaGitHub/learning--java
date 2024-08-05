//package Leetcode.563. Binary Tree Tilt;

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
    public int findTilt(TreeNode root) {
        int tilt[] = new int[1];
        dfs(root, tilt);
        return tilt[0];
    }

    public int dfs(TreeNode root, int[] tilt) {
        if (root == null)
            return 0;

        int l = dfs(root.left, tilt);
        int r = dfs(root.right, tilt);

        tilt[0] += Math.abs(l - r);

        return root.val + l + r;
    }
}
