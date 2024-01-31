//package Leetcode.167. Two Sum II - Input Array Is Sorted;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // future look : try binary search

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target)
                    return new int[] { i + 1, j + 1 };
            }

        }
        return new int[] { -1, -1 };

    }
}