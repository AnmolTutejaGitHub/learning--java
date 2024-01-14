class Solution {
    public int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length + 1; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }
}