// package Leetcode.257. Binary Tree Paths;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        DFS(root, "", res);
        return res;
    }

    public void DFS(TreeNode node, String ans, List<String> res) {
        if (node != null && node.left == null && node.right == null) {
            ans += node.val + "->";
            res.add(ans.substring(0, ans.length() - 2));
            return;
        }

        if (node != null)
            DFS(node.left, ans + node.val + "->", res);
        if (node != null)
            DFS(node.right, ans + node.val + "->", res);

    }
}
