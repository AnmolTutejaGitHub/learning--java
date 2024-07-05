//package Leetcode.3112. Minimum Time to Visit Disappearing Nodes;

import java.util.*;

class Pair {
    int node;
    int time;

    Pair(int node, int time) {
        this.node = node;
        this.time = time;
    }
}

class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.time - p2.time);
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0] = 0;

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }

        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int time = pq.peek().time;
            pq.poll();
            vis[node] = true;
            if (dis[node] < time)
                continue;

            for (Pair neighbor : adj.get(node)) {
                if (!vis[neighbor.node]) {
                    if (dis[neighbor.node] > time + neighbor.time && disappear[neighbor.node] > time + neighbor.time) {
                        dis[neighbor.node] = time + neighbor.time;
                        pq.add(new Pair(neighbor.node, time + neighbor.time));
                    }
                }
            }
        }

        for (int i = 0; i < dis.length; i++) {
            if (dis[i] == Integer.MAX_VALUE)
                dis[i] = -1;
        }
        return dis;
    }
}
