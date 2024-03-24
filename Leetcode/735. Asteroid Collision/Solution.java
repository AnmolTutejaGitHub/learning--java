//package Leetcode.735. Asteroid Collision;

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            while (!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                int sum = asteroids[i] + st.peek();

                if (sum < 0) {
                    st.pop();
                } else if (sum > 0) {
                    asteroids[i] = 0;
                } else if (sum == 0) {
                    st.pop();
                    asteroids[i] = 0;
                }
            }

            if (asteroids[i] != 0) {
                st.push(asteroids[i]);
            }
        }

        int ans[] = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
