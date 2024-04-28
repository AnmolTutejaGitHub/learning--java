// package Leetcode.404. Sum of Left Leaves;

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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum[] = new int[1];
        sum[0] = 0;
        DFS(root, sum);
        return sum[0];
    }

    public void DFS(TreeNode node, int[] sum) {
        if (node == null)
            return;

        if (node.left != null && node.left.left == null && node.left.right == null) {
            sum[0] += node.left.val;
            // return;
        }

        // if(node.right != null && node.right.left!=null) {
        // sum[0]+= node.right.left.val;
        // return;
        // }

        DFS(node.left, sum);
        DFS(node.right, sum);
    }
}
