//package Leetcode.1305. All Elements in Two Binary Search Trees;

import java.util.*;

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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> inorder1 = new ArrayList<>();
        List<Integer> inorder2 = new ArrayList<>();
        dfs(root1, inorder1);
        dfs(root2, inorder2);
        return merge(inorder1, inorder2);
    }

    public void dfs(TreeNode root, List<Integer> inorder) {
        if (root == null)
            return;

        dfs(root.left, inorder);
        inorder.add(root.val);
        dfs(root.right, inorder);
    }

    public List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                res.add(l1.get(i));
                i++;
            } else {
                res.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size())
            res.add(l1.get(i++));
        while (j < l2.size())
            res.add(l2.get(j++));

        return res;
    }
}