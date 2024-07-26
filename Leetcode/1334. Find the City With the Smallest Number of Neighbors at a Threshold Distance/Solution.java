import java.util.*;

class Pair {
    int node;
    int wt;

    Pair(int node, int wt) {
        this.node = node;
        this.wt = wt;
    }
}

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }

        int min = Integer.MAX_VALUE;
        int min_node = -1;

        for (int i = 0; i < n; i++) {
            int curr = dijkstra(i, n, edges, distanceThreshold, adj);
            if (curr <= min) {
                min = curr;
                min_node = i;
            }
        }
        return min_node;
    }

    public int dijkstra(int src, int n, int[][] edges, int threshold, ArrayList<ArrayList<Pair>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.wt - p2.wt);
        boolean vis[] = new boolean[n];
        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        pq.add(new Pair(src, 0));
        dis[src] = 0;
        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int wt = pq.peek().wt;
            pq.poll();
            vis[node] = true;
            if (dis[node] < wt)
                continue;

            for (Pair neighbor : adj.get(node)) {
                if (!vis[neighbor.node]) {
                    if (dis[neighbor.node] > wt + neighbor.wt) {
                        dis[neighbor.node] = wt + neighbor.wt;
                        pq.add(new Pair(neighbor.node, wt + neighbor.wt));
                    }
                }
            }

        }

        int count = 0;
        for (int i = 0; i < dis.length; i++) {
            if (dis[i] <= threshold)
                count++;
        }
        return count;
    }
}