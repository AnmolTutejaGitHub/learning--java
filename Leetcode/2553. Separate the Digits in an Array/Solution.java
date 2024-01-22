//package Leetcode.2553. Separate the Digits in an Array;

import java.util.ArrayList;

class Solution {
    public int[] separateDigits(int[] nums) {
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i : nums){
        // while(i!=0){
        // ans.add(i%10);
        // i/=10;
        // }
        // }
        // //int[] arr= ans.toArray(new int[ans.size()]);
        // int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        // return arr;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i : nums) {
            String a = "" + i;
            for (int j = 0; j < a.length(); j++) {
                // ans.add(Integer.parseInt(a.charAt(j)));
                ans.add(Integer.parseInt(String.valueOf(a.charAt(j))));
            }

        }
        // return ans.toArray(new int[ans.size()]);
        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }
}
