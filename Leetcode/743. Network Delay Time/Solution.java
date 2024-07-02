//package Leetcode.743. Network Delay Time;

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
    public int networkDelayTime(int[][] times, int n, int k) {
        int time[] = new int[n + 1];
        Arrays.fill(time, Integer.MAX_VALUE);
        time[k] = 0;
        time[0] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.time - p2.time);

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        boolean vis[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < times.length; i++) {
            adj.get(times[i][0]).add(new Pair(times[i][1], times[i][2]));
        }

        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int t = pq.peek().time;
            pq.poll();

            vis[node] = true;

            for (Pair neighbor : adj.get(node)) {
                if (!vis[neighbor.node] && time[neighbor.node] > t + neighbor.time) {
                    time[neighbor.node] = t + neighbor.time;
                    pq.add(new Pair(neighbor.node, time[neighbor.node]));
                }
            }
        }

        int max = 0;
        for (int ti : time) {
            if (ti == Integer.MAX_VALUE)
                return -1;
            max = Math.max(max, ti);
        }
        return max;
    }
}