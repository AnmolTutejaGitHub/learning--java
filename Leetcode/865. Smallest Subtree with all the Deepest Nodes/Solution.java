//package Leetcode.865. Smallest Subtree with all the Deepest Nodes;
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
    TreeNode node;
    int depth;
    int deepest_depth;

    Pair(TreeNode node, int depth, int deepest_depth) {
        this.node = node;
        this.depth = depth;
        this.deepest_depth = deepest_depth;
    }
}

class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Pair res = dfs(root, 0);
        return res.node;
    }

    public Pair dfs(TreeNode root, int depth) {
        if (root == null)
            return new Pair(null, depth + 1, depth + 1);

        Pair l = dfs(root.left, depth + 1);
        Pair r = dfs(root.right, depth + 1);

        if (l.node == null && r.node == null)
            return new Pair(root, depth + 1, depth + 1);
        else if (l.node != null && r.node == null)
            return l;
        else if (r.node != null && l.node == null)
            return r;
        else {
            if (l.deepest_depth > r.deepest_depth)
                return l;
            else if (r.deepest_depth > l.deepest_depth)
                return r;
            else
                return new Pair(root, depth + 1, l.deepest_depth);
        }
    }
}
