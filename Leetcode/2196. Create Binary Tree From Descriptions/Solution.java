//package Leetcode.2196. Create Binary Tree From Descriptions;

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

class Pair {
    int child;
    int isLeft;

    Pair(int child, int isLeft) {
        this.child = child;
        this.isLeft = isLeft;
    }
}

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
        Set<Integer> child = new HashSet<>();

        for (int i = 0; i < descriptions.length; i++) {
            if (!map.containsKey(descriptions[i][0])) {
                map.put(descriptions[i][0], new ArrayList<>());
            }
            map.get(descriptions[i][0]).add(new Pair(descriptions[i][1], descriptions[i][2]));
            child.add(descriptions[i][1]);
        }

        TreeNode root = null;

        for (int[] d : descriptions) {
            if (!child.contains(d[0])) {
                root = new TreeNode(d[0]);
                break;
            }
        }
        return dfs(root, map);
    }

    public TreeNode dfs(TreeNode parent, HashMap<Integer, ArrayList<Pair>> map) {
        if (parent == null)
            return null;

        ArrayList<Pair> child = map.get(parent.val);
        if (child == null)
            return parent;

        for (Pair c : child) {
            TreeNode node = new TreeNode(c.child);
            if (c.isLeft == 1)
                parent.left = dfs(node, map);
            else if (c.isLeft == 0)
                parent.right = dfs(node, map);
        }

        return parent;
    }
}
