//package Leetcode.2233. Maximum Product After K Increments;

import java.util.PriorityQueue;

class Solution {
    public int maximumProduct(int[] nums, int k) {
        int M = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : nums) pq.add(ele);

        while(k>0){
            int curr = pq.poll();
            pq.add(curr+1);
            k--;
        }

       long prod = 1;
        while(!pq.isEmpty())  prod = (prod * pq.poll()) % M;
        return (int) prod;
    }
}
