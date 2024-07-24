//package Leetcode.2191. Sort the Jumbled Numbers;

import java.util.*;

class Pair {
    int num;
    int map;
    int idx;

    Pair(int num, int map, int idx) {
        this.num = num;
        this.map = map;
        this.idx = idx;
    }
}

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(com);
        for (int i = 0; i < nums.length; i++) {
            int map = getCorres(mapping, nums[i]);
            pq.add(new Pair(nums[i], map, i));
        }

        int i = 0;
        while (!pq.isEmpty()) {
            nums[i++] = pq.poll().num;
        }
        return nums;
    }

    public int getCorres(int[] mapping, int n) {
        if (n == 0)
            return mapping[n];
        int idx = 1;
        int res = 0;
        while (n > 0) {
            int map = mapping[n % 10];
            res += map * idx;
            idx *= 10;
            n /= 10;
        }
        return res;
    }

    Comparator<Pair> com = new Comparator<>() {
        public int compare(Pair p1, Pair p2) {
            if (p1.map != p2.map)
                return p1.map - p2.map;
            return p1.idx - p2.idx;
        }
    };
}