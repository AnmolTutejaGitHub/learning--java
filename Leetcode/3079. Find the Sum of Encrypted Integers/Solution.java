class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += encrypt(nums[i]);
        }
        return sum;
    }

    public int encrypt(int n) {
        int max = 0;
        int len = 0;

        while (n > 0) {
            int rem = n % 10;
            max = Math.max(max, rem);
            n = n / 10;
            len++;
        }

        int ans = 0;
        while (len != 0) {
            ans = ans * 10;
            ans += max;
            len--;
        }

        return ans;
    }
}