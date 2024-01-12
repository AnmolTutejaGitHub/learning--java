//package Leetcode.2798. Number of Employees Who Met the Target;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target)
                count++;
        }
        return count;
    }
}