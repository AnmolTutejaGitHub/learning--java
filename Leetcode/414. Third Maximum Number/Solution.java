//package Leetcode.414. Third Maximum Number;

import java.util.Arrays;

// class Solution {
//     public int thirdMax(int[] nums) {
//         Arrays.sort(nums);
//         int l = nums[nums.length - 1];
//         if (nums.length <= 2)
//             return l;

//         int count = 1;
//         for (int i = nums.length - 2; i >= 0; i--) {
//             if (nums[i] != nums[i + 1])
//                 count++;
//             if (count == 3)
//                 return nums[i];
//         }
//         return l;
//     }
// }

class Solution {
    public int thirdMax(int[] nums) {
        long l = Long.MIN_VALUE;
        long sl = Long.MIN_VALUE;
        long tl = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > l) {
                tl = sl;
                sl = l;
                l = nums[i];
            }

            else if (nums[i] > sl && nums[i] < l) {
                tl = sl;
                sl = nums[i];
            }

            else if (nums[i] > tl && nums[i] < sl) {
                tl = nums[i];
            }
        }
        if (tl != Long.MIN_VALUE)
            return (int) tl;
        return (int) l;
    }
}
