// package Leetcode.1980. Find Unique Binary String;
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder res = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(idx) == '0')
                res.append('1');
            else if (nums[i].charAt(idx) == '1')
                res.append('0');
            idx++;
        }
        return res.toString();
    }
}
