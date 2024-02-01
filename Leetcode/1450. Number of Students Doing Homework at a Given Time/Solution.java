//package Leetcode.1450. Number of Students Doing Homework at a Given Time;

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime <= endTime[i] && queryTime >= startTime[i])
                count++;
        }
        return count;
    }
}
