class Solution {
    public int findMiddleIndex(int[] nums) {

        int middleIndex = -1;
        int ls = 0;
        // int rs=0;
        int ts = 0;
        for (int i = 0; i < nums.length; i++) {
            ts += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ls = 0;
            // rs=0;
            // ts+=nums[i];
            for (int j = 0; j < i; j++) {
                ls += nums[j];
                // rs+=nums[nums.length-j-1];
            }

            if ((ts - ls) - ls - nums[i] == 0)
                return middleIndex = i;
        }
        return middleIndex;
    }
}