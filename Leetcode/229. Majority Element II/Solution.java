//package Leetcode.229. Majority Element II;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int check = nums.length / 3;
        int freq[] = new int[nums.length];

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    freq[i]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > check && (!ans.contains(nums[i])))
                ans.add(nums[i]);
        }

        return ans;

    }
}
