//package Leetcode.1047. Remove All Adjacent Duplicates In String;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ele : s.toCharArray()) {
            if (deque.isEmpty() || deque.peekLast() != ele) {
                deque.addLast(ele);
            } else if (deque.peekLast() == ele) {
                deque.removeLast();
            }
        }

        while (!deque.isEmpty()) {
            ans.append(deque.removeFirst());
        }
        return ans.toString();
    }

}
