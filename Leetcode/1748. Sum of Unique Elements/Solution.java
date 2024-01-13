
//package Leetcode.1748. Sum of Unique Elements;
import java.util.ArrayList;

class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean isCommon = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isCommon = true;
                    break;
                }
            }
            if (isCommon == false)
                arr.add(nums[i]);
        }
        int sum = 0;
        for (int ele : arr)
            sum += ele;

        return sum;
    }
}
