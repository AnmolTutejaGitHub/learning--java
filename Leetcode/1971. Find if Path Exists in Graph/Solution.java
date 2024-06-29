//package Leetcode.1971. Find if Path Exists in Graph;

import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        boolean[] vis = new boolean[n];
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                boolean fs[] = new boolean[1];
                boolean fd[] = new boolean[1];
                dfs(i, edges, source, destination, fs, fd, adj, vis);
                if (fs[0] && fd[0])
                    return true;
                if (fs[0] && !fd[0])
                    return false;
                if (!fs[0] && fd[0])
                    return false;
            }
        }
        return false;
    }

    public void dfs(int node, int[][] edges, int s, int d, boolean fs[], boolean fd[],
            ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        if (node == s)
            fs[0] = true;
        if (node == d)
            fd[0] = true;

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor])
                dfs(neighbor, edges, s, d, fs, fd, adj, vis);
        }
    }
}
