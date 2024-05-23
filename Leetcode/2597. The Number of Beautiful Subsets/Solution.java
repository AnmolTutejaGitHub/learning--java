//package Leetcode.2597. The Number of Beautiful Subsets;

import java.util.*;

class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        int count[] = new int[1];
        // HashSet<Integer> set = new HashSet<>();
        List<Integer> ls = new ArrayList<>() {
            @Override
            public boolean contains(Object obj) {
                int index = Collections.binarySearch(this, (Integer) obj);
                return index >= 0;
            }
        };

        backtrack(0, nums, k, count, ls);
        return count[0];
    }

    public void backtrack(int index, int[] nums, int k, int[] count, List<Integer> ls) {
        if (index > nums.length)
            return;
        if (index == nums.length) {
            if (ls.size() != 0)
                count[0]++;
            return;
        }

        // take
        boolean passed = false;
        if (!ls.contains(nums[index] - k)) {
            passed = true;
            ls.add(nums[index]);
            backtrack(index + 1, nums, k, count, ls);
        }

        // not take
        if (passed)
            ls.remove(ls.size() - 1);
        backtrack(index + 1, nums, k, count, ls);
    }

}

// I used set to keep track of prev element to check that k condition but my
// test cases failed if array had
// duplicated elements :
// [1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000]
// so used list to keep of prev elemnent
