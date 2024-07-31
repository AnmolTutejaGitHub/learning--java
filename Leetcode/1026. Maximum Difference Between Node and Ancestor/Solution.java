//package Leetcode.1026. Maximum Difference Between Node and Ancestor;

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
    int max;
    int min;

    Pair(int max, int min) {
        this.max = max;
        this.min = min;
    }
}

class Solution {
    public int maxAncestorDiff(TreeNode root) {
        int res[] = new int[1];
        dfs(root, res);
        return res[0];
    }

    public Pair dfs(TreeNode root, int res[]) {
        if (root == null)
            return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);

        Pair l = dfs(root.left, res);
        Pair r = dfs(root.right, res);

        if (l.max != Integer.MIN_VALUE)
            res[0] = Math.max(res[0], Math.abs(l.max - root.val));
        if (l.min != Integer.MAX_VALUE)
            res[0] = Math.max(res[0], Math.abs(l.min - root.val));

        if (r.max != Integer.MIN_VALUE)
            res[0] = Math.max(res[0], Math.abs(r.max - root.val));
        if (r.min != Integer.MAX_VALUE)
            res[0] = Math.max(res[0], Math.abs(r.min - root.val));

        return new Pair(Math.max(root.val, Math.max(l.max, r.max)), Math.min(root.val, Math.min(l.min, r.min)));

    }
}
