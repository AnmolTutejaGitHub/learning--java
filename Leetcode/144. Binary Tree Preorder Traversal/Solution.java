//package Leetcode.144. Binary Tree Preorder Traversal;

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        pre(root, ls);
        return ls;
    }

    public void pre(TreeNode node, List<Integer> ls) {
        if (node == null)
            return;

        ls.add(node.val);
        pre(node.left, ls);
        pre(node.right, ls);
    }
}
