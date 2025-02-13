import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add((long) num);
        }

        int count = 0;
        while (!pq.isEmpty() && pq.size() >= 2) {
            if (pq.peek() >= k)
                return count;
            long a = pq.poll();
            long b = pq.poll();
            count++;
            pq.add(Math.min(a, b) * 2 + Math.max(a, b));
        }
        return count;
    }
}