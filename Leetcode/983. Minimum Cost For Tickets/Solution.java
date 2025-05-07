//package Leetcode.983. Minimum Cost For Tickets;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int []memo = new int[366];
        Arrays.fill(memo,-1);

        HashSet<Integer> set = new HashSet<>();
        for(int i : days) set.add(i);
        memorization(costs,0,memo,set);
        return memo[0];
    }

    public int memorization(int[] costs,int day,int[]memo,HashSet<Integer> set){
        if(day>=366) return 0;
        if(memo[day]!=-1) return memo[day];

        if(!set.contains(day)) {
            memo[day] = memorization(costs,day+1,memo,set);
            return memo[day];
        }

        int one = costs[0]+memorization(costs,day+1,memo,set);
        int seven = costs[1]+memorization(costs,day+7,memo,set);
        int thirty = costs[2]+memorization(costs,day+30,memo,set);

        memo[day] = Math.min(one,Math.min(seven,thirty));
        return memo[day];
    }
}
