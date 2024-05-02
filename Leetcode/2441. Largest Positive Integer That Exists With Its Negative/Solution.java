class Solution {
    public int findMaxK(int[] nums) {
        int map[] = new int[2002];
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0)
                map[Math.abs(nums[i])]++;
            else
                map[1000 + nums[i]]++;

            if (map[Math.abs(nums[i])] != 0 && map[1000 + Math.abs(nums[i])] != 0)
                max = Math.max(max, Math.abs(nums[i]));
        }
        return max;
    }
}
