//package Leetcode.229. Majority Element II;

import java.util.ArrayList;
import java.util.List;

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int check = nums.length / 3;
//         int freq[] = new int[nums.length];

//         List<Integer> ans = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j])
//                     freq[i]++;
//             }
//         }

//         for (int i = 0; i < freq.length; i++) {
//             if (freq[i] > check && (!ans.contains(nums[i])))
//                 ans.add(nums[i]);
//         }

//         return ans;

//     }
// }

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int ele1 = 0, ele2 = 0;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                count2++;
            } else if (ele1 == nums[i])
                count1++;
            else if (ele2 == nums[i])
                count2++;
            else {
                count1--;
                count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ele1 == nums[i])
                count1++;
            if (ele2 == nums[i])
                count2++;
        }

        if (count1 > nums.length / 3)
            res.add(ele1);
        if (count2 > nums.length / 3 && ele1 != ele2)
            res.add(ele2);

        return res;
    }
}