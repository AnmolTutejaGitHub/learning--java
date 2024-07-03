//package Leetcode.2642. Design Graph With Shortest Path Calculator;

import java.util.*;

class Pair {
    int node;
    int cost;

    Pair(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }
}

class Graph {

    ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

    public Graph(int n, int[][] edges) {
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++)
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
    }

    public void addEdge(int[] edge) {
        if (edge[0] >= adj.size())
            adj.add(new ArrayList<>());
        adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
    }

    public int shortestPath(int node1, int node2) {
        int src = node1;
        int dst = node2;

        int cost[] = new int[adj.size()];
        boolean vis[] = new boolean[adj.size()];
        for (int i = 0; i < cost.length; i++)
            cost[i] = Integer.MAX_VALUE;
        cost[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.cost - p2.cost);

        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int c = pq.peek().cost;
            pq.poll();
            vis[node] = true;
            if (node == dst)
                return cost[node];

            if (cost[node] < c)
                continue;

            for (Pair neighbor : adj.get(node)) {
                if (!vis[neighbor.node]) {
                    if (cost[neighbor.node] > neighbor.cost + c) {
                        cost[neighbor.node] = neighbor.cost + c;
                        pq.add(new Pair(neighbor.node, neighbor.cost + c));
                    }
                }
            }
        }
        return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
