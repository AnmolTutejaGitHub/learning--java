//package Leetcode.1700. Number of Students Unable to Eat Lunch;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }

        int i = 0;
        while (count < sandwiches.length && i < sandwiches.length) {
            if (q.peek() == sandwiches[i]) {
                q.remove();
                count = 0;
                i++;
            } else {
                q.add(q.remove());
                count++;
            }
        }

        return q.size();

    }
}