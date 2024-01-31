//package Leetcode.1313. Decompress Run-Length Encoded List;

import java.util.ArrayList;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        int freq = 0;
        int val = 1;
        for (int i = 0; i < nums.length; i += 2) {
            freq = nums[i];
            if (i + 1 < nums.length)
                val = nums[i + 1];
            boolean flag = true;
            while (flag) {
                ans.add(val);
                freq--;
                if (freq == 0)
                    flag = false;
            }
        }

        int[] arr = new int[ans.size()];

        for (int i = 0; i < arr.length; i++)
            arr[i] = ans.get(i);

        return arr;
    }
}
