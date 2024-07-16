//package Leetcode.2096. Step-By-Step Directions From a Binary Tree Node to Another;

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
    int node;
    String s;

    Pair(int node, String s) {
        this.node = node;
        this.s = s;
    }
}

class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        HashMap<Integer, ArrayList<Integer>> neighbor = new HashMap<>();
        markNeighbors(root, neighbor, -1);
        boolean[] vis = new boolean[100001];

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startValue, ""));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            vis[curr.node] = true;
            if (curr.node == destValue)
                return curr.s;

            int i = 0;
            for (int n : neighbor.get(curr.node)) {
                if (n != -1 && !vis[n]) {
                    String dir = "";
                    if (i == 0)
                        dir = "U";
                    if (i == 1)
                        dir = "L";
                    else if (i == 2)
                        dir = "R";
                    q.add(new Pair(n, curr.s + dir));
                }
                i++;
            }
        }
        return "";
    }

    public void markNeighbors(TreeNode node, HashMap<Integer, ArrayList<Integer>> neighbor, int parent) {
        if (node == null)
            return;

        neighbor.put(node.val, new ArrayList<Integer>());
        neighbor.get(node.val).add(parent);
        if (node.left != null)
            neighbor.get(node.val).add(node.left.val);
        else
            neighbor.get(node.val).add(-1);
        if (node.right != null)
            neighbor.get(node.val).add(node.right.val);
        else
            neighbor.get(node.val).add(-1);

        markNeighbors(node.left, neighbor, node.val);
        markNeighbors(node.right, neighbor, node.val);
    }
}