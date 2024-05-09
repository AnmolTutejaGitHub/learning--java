// package Leetcode.671. Second Minimum Node In a Binary Tree;
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
    public int findSecondMinimumValue(TreeNode root) {
        long s[] = { Long.MAX_VALUE };
        long ss[] = { Long.MAX_VALUE };
        DFS(root, s, ss);
        if (ss[0] == Long.MAX_VALUE)
            return -1;
        return (int) ss[0];
    }

    public void DFS(TreeNode node, long[] s, long[] ss) {
        if (node == null)
            return;

        DFS(node.left, s, ss);

        if (node.val < s[0]) {
            ss[0] = s[0];
            s[0] = node.val;
        } else if (node.val < ss[0] && node.val != s[0]) {
            ss[0] = node.val;
        }

        DFS(node.right, s, ss);
    }
}
