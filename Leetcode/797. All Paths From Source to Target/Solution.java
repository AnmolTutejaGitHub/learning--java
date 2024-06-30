//package Leetcode.797. All Paths From Source to Target;

import java.util.*;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];
        vis[0] = true;
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(0, graph, res, path, vis);
        return res;
    }

    public void dfs(int node, int[][] graph, List<List<Integer>> res, List<Integer> path, boolean[] vis) {
        if (node == graph.length - 1) {
            res.add(new ArrayList<>(path));
        }

        for (int neighbor : graph[node]) {
            if (!vis[neighbor]) {
                vis[neighbor] = true;
                path.add(neighbor);
                dfs(neighbor, graph, res, path, vis);
                path.remove(path.size() - 1);
                vis[neighbor] = false;
            }
        }

    }
}