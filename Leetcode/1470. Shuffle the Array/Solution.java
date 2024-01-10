class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] numsx = new int[nums.length / 2];
        int[] numsy = new int[nums.length / 2];

        for (int i = 0; i < nums.length / 2; i++) {
            numsx[i] = nums[i];
            numsy[i] = nums[i + nums.length / 2];
        }

        int j = 0;
        int k = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                ans[i] = numsx[j++];
            else
                ans[i] = numsy[k++];
        }
        return ans;
    }

}