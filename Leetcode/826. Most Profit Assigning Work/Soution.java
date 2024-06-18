//package Leetcode.826. Most Profit Assigning Work;

import java.util.*;

class Pair {
    int profit;
    int difficulty;

    Pair(int profit, int difficulty) {
        this.profit = profit;
        this.difficulty = difficulty;
    }
}

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Pair pair[] = new Pair[profit.length];
        for (int i = 0; i < profit.length; i++)
            pair[i] = new Pair(profit[i], difficulty[i]);

        Arrays.sort(pair, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                int com = Integer.compare(p1.difficulty, p2.difficulty);
                if (com == 0)
                    return Integer.compare(p2.profit, p1.profit);
                return com;
            }
        });

        PriorityQueue<Pair> pq = new PriorityQueue<>(comp);
        int res = 0;
        int j = 0;
        Arrays.sort(worker);
        for (int i = 0; i < worker.length; i++) {
            while (j < pair.length && worker[i] >= pair[j].difficulty) {
                pq.add(pair[j]);
                j++;
            }
            if (!pq.isEmpty())
                res += pq.peek().profit;
        }

        return res;
    }

    Comparator comp = new Comparator<Pair>() {
        public int compare(Pair p1, Pair p2) {
            return Integer.compare(p2.profit, p1.profit);
        }
    };
}
