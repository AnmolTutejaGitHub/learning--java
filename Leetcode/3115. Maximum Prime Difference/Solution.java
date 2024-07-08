class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                first = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (isPrime(nums[i])) {
                last = i;
                break;
            }
        }
        return last - first;
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}