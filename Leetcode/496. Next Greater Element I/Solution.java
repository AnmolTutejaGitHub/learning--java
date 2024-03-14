//package Leetcode.496. Next Greater Element I;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>(); // nums2 , its next greatest

        for (int i = nums2.length - 1; i >= 0; i--) {

            if (stack.isEmpty()) {
                stack.push(nums2[i]);
                map.put(nums2[i], -1);
            }

            else if (stack.peek() > nums2[i]) {
                map.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            } else if (stack.peek() <= nums2[i]) {
                while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                    stack.pop();
                }
                if (!stack.isEmpty())
                    map.put(nums2[i], stack.peek());
                else
                    map.put(nums2[i], -1);

                stack.push(nums2[i]);
            }

        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }

        return nums1;
    }
}
