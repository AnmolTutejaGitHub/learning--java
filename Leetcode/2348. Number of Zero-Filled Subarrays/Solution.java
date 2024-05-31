class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int s = 0;
        long count = 0;

        for (int e = 0; e < nums.length; e++) {
            if (nums[s] == 0 && nums[e] == 0)
                count += e - s + 1;

            if (nums[e] != 0)
                s = e + 1;
            else if (nums[s] != 0)
                s++;
        }

        return count;
    }
}