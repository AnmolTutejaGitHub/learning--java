import java.util.*;

class Pair {
    int val;
    int idx;

    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int res[] = new int[arr.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(arr[i], i));
        }

        int rank = 0;
        int prev = -1;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (curr.val != prev)
                rank++;
            res[curr.idx] = rank;
            prev = curr.val;
        }
        return res;
    }
}