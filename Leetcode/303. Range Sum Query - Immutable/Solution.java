//package Leetcode.303. Range Sum Query - Immutable;

class NumArray {
    static int prefix[];

    public NumArray(int[] nums) {
        int prefix_[] = new int[nums.length];
        prefix_[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix_[i] = prefix_[i - 1] + nums[i];
        }
        prefix = prefix_;
    }

    public int sumRange(int left, int right) {
        return prefix[right] - (left - 1 >= 0 ? prefix[left - 1] : 0);
    }
}
