//package Leetcode.1399. Count Largest Group;

import java.util.HashMap;

class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum = digitSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        int max = 0;
        int count = 0;

        for (int freq : map.values()) {
            if (freq > max) {
                max = freq;
                count = 1;
            } else if (freq == max) {
                count++;
            }
        }

        return count;
    }

    public int digitSum(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}