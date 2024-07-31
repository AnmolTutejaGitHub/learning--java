//package Leetcode.2265. Count Nodes Equal to Average of Subtree;
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

class Pair {
    double sum;
    int totalNodes;

    Pair(double sum, int totalNodes) {
        this.sum = sum;
        this.totalNodes = totalNodes;
    }
}

class Solution {
    public int averageOfSubtree(TreeNode root) {
        int count[] = new int[1];
        calcAvg(root, count);
        return count[0];
    }

    public Pair calcAvg(TreeNode root, int[] count) {
        if (root == null)
            return new Pair(0, 0);

        Pair l = calcAvg(root.left, count);
        Pair r = calcAvg(root.right, count);

        int totalNodes = 1 + l.totalNodes + r.totalNodes;
        if ((int) (l.sum + r.sum + root.val) / totalNodes == root.val)
            count[0]++;

        return new Pair((l.sum + r.sum + root.val), totalNodes);
    }
}