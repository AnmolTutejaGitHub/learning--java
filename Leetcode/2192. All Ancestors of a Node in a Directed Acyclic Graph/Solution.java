//package Leetcode.2192. All Ancestors of a Node in a Directed Acyclic Graph;

import java.util.*;

class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        mark_parents(n, edges, map);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            res.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            boolean vis[] = new boolean[n];
            dfs(i, i, map, vis, res);
            Collections.sort(res.get(i));
        }
        return res;
    }

    public void dfs(int original, int node, HashMap<Integer, ArrayList<Integer>> map, boolean[] vis,
            List<List<Integer>> res) {
        vis[node] = true;

        for (int parent : map.get(node)) {
            if (!vis[parent]) {
                res.get(original).add(parent);
                dfs(original, parent, map, vis, res);
            }
        }
    }

    public void mark_parents(int n, int[][] edges, HashMap<Integer, ArrayList<Integer>> map) {
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < edges.length; i++) {
            map.get(edges[i][1]).add(edges[i][0]);
            // map.put(edges[i][1],map.get(edges[i][1]).add(edges[i][0]));
        }
    }
}
