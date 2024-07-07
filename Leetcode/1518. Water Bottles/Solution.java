//package Leetcode.1518. Water Bottles;

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles / numExchange != 0) {
            int consumed = numBottles / numExchange;
            count += numBottles / numExchange;
            numBottles = numBottles % numExchange; // left
            numBottles += consumed;
        }
        return count;
    }
}