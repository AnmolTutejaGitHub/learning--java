// package Leetcode.179. Largest Number;

import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        Boolean leadingZeros = true;
        StringBuilder res = new StringBuilder();
        for (String i : arr) {
            if (leadingZeros && Integer.parseInt(i) == 0)
                continue;
            leadingZeros = false;
            res.append(i);
        }

        if (res.length() == 0)
            return "0";
        return res.toString();
    }
}

// intution : seeing arr and output it got cleared that I have to sort in
// decreasing order
// but say 30 and 9 I need to check 3 and 9 ,, 9 is greater so put 9 in sorted
// arr before 34
// also 30 and 34 ,, check for 3 if same then check 0 and 4 this is decreasing
// lexographical
// order I tried to adjust mergesort in this type of sorting but failed so used
// inbuilt sort
