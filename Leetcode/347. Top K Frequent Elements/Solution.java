// package Leetcode.347. Top K Frequent Elements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[] = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>(com);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] pair = { entry.getKey(), entry.getValue() };
            pq.add(pair);
        }

        for (int i = 0; i < k; i++)
            res[i] = pq.poll()[0];
        return res;
    }

    Comparator<int[]> com = new Comparator<>() {
        public int compare(int[] pair1, int[] pair2) {
            return Integer.compare(pair2[1], pair1[1]);
        }
    };
}
