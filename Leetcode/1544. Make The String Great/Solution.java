//package Leetcode.1544. Make The String Great;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String makeGood(String s) {
        StringBuilder res = new StringBuilder();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ele : s.toCharArray()) {
            if (!deque.isEmpty() && Math.abs(ele - deque.peekLast()) == 32) {
                deque.removeLast();
            } else {
                deque.addLast(ele);
            }
        }

        while (!deque.isEmpty()) {
            res.append(deque.removeFirst());
        }

        return res.toString();
    }
}
