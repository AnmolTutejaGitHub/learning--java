//package Leetcode.129. Sum Root to Leaf Numbers;

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
    public int sumNumbers(TreeNode root) {
        int[] sum = new int[1];
        DFS(root, 0, sum);
        return sum[0];
    }

    public void DFS(TreeNode node, int num, int[] sum) {
        if (node == null)
            return;
        if (node != null && node.left == null && node.right == null) {
            sum[0] += num * 10 + node.val;
            return;
        }

        DFS(node.left, num * 10 + node.val, sum);
        DFS(node.right, num * 10 + node.val, sum);
    }
}
