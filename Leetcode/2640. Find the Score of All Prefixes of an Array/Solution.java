class Solution {
    public long[] findPrefixScore(int[] nums) {

        long[] prefix = new long[nums.length];
        prefix[0] = nums[0] * 2;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            prefix[i] = nums[i] + max + prefix[i - 1];
        }

        return prefix;

    }
}
