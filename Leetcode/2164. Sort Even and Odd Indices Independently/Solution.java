//package Leetcode.2164. Sort Even and Odd Indices Independently;

import java.util.Arrays;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int odd[] = new int[nums.length / 2];
        int even[] = new int[nums.length - odd.length];
        int e = 0;
        int o = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                even[e++] = nums[i];
            else
                odd[o++] = nums[i];
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        for (int i = 0; i < odd.length / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[odd.length - 1 - i];
            odd[odd.length - 1 - i] = temp;
        }

        e = 0;
        o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                nums[i] = even[e++];
            else
                nums[i] = odd[o++];
        }

        return nums;
    }
}
