//package Leetcode.841. Keys and Rooms;

import java.util.List;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(0, rooms, vis);

        for (int i = 0; i < vis.length; i++) {
            if (!vis[i])
                return false;
        }

        return true;
    }

    public void dfs(int node, List<List<Integer>> rooms, boolean[] vis) {
        vis[node] = true;

        for (int neighbor : rooms.get(node)) {
            if (!vis[neighbor])
                dfs(neighbor, rooms, vis);
        }
    }
}
