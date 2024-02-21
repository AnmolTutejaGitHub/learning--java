//package Leetcode.2418. Sort the People;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length - 1 - i; j++) {
                if (heights[j] < heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    String tempt = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempt;

                }
            }
        }
        return names;

    }
}
