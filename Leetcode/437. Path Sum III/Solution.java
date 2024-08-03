//package Leetcode.437. Path Sum III;
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
    public int pathSum(TreeNode root, int targetSum) {
        int[] count = new int[1];
        generatePaths(root, targetSum, count);
        return count[0];
    }

    public void isPath(TreeNode root, long target, int[] count) {
        if (root == null)
            return;

        target -= root.val;
        if (target == 0) {
            count[0]++;
        }

        isPath(root.left, target, count);
        isPath(root.right, target, count);
    }

    public void generatePaths(TreeNode root, long target, int[] count) {
        if (root == null)
            return;

        isPath(root, target, count);
        generatePaths(root.left, target, count);
        generatePaths(root.right, target, count);
    }
}
