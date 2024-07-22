//package Leetcode.2368. Reachable Nodes With Restrictions;

import java.util.*;

class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        HashSet<Integer> set = new HashSet<>();
        boolean vis[] = new boolean[n];

        for (int i = 0; i < restricted.length; i++) {
            set.add(restricted[i]);
        }

        int count[] = new int[1];
        dfs(0, adj, set, count, vis);
        return count[0];
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, HashSet<Integer> set, int[] count, boolean[] vis) {
        vis[node] = true;
        count[0]++;

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor] && !set.contains(neighbor)) {
                dfs(neighbor, adj, set, count, vis);
            }
        }
    }
}