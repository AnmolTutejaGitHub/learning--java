//package Leetcode.787. Cheapest Flights Within K Stops;

import java.util.*;

class Pair {
    int node;
    int cost;
    int stops;

    Pair(int node, int cost, int stops) {
        this.node = node;
        this.cost = cost;
        this.stops = stops;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.cost - p2.cost);
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length; i++) {
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];
            adj.get(from).add(new Pair(to, cost, 0)); // will not use this stops data from here
        }

        int cost[] = new int[n];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[src] = 0;

        pq.add(new Pair(src, 0, 0)); // till src,total cost
        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int totalCost = pq.peek().cost;
            int stops = pq.peek().stops;
            pq.poll();
            if (stops > k)
                continue;

            for (Pair neighbor : adj.get(node)) {
                if (totalCost + neighbor.cost < cost[neighbor.node] || stops < k) {
                    cost[neighbor.node] = Math.min(totalCost + neighbor.cost, cost[neighbor.node]);
                    pq.add(new Pair(neighbor.node, totalCost + neighbor.cost, stops + 1));
                }
            }
        }

        if (cost[dst] == Integer.MAX_VALUE)
            return -1;
        return cost[dst];
    }
}