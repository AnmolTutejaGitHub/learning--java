// package Leetcode.1022. Sum of Root To Leaf Binary Numbers;
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
    public int sumRootToLeaf(TreeNode root) {
        int sum[] = new int[1];
        DFS(root, "0", sum);
        return sum[0];
    }

    public void DFS(TreeNode node, String currBinary, int[] sum) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            currBinary += node.val;
            // System.out.println(currBinary);
            sum[0] += Integer.parseInt(currBinary, 2);
            return;
        }

        DFS(node.left, currBinary + node.val, sum);
        DFS(node.right, currBinary + node.val, sum);
    }
}
