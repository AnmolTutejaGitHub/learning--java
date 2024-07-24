//package Leetcode.785. Is Graph Bipartite?;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int vis[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (vis[i] == 0) {
                if (!dfs(i, 1, graph, vis))
                    return false;
            }
        }
        return true;
    }

    public boolean dfs(int node, int color, int[][] graph, int[] vis) {
        vis[node] = color;

        for (int neighbor : graph[node]) {
            if (vis[neighbor] == 0) {
                if (color == 1) {
                    if (!dfs(neighbor, 2, graph, vis))
                        return false;
                } else if (color == 2) {
                    if (!dfs(neighbor, 1, graph, vis))
                        return false;
                }
            } else if (vis[neighbor] == color)
                return false;
        }

        return true;
    }
}
