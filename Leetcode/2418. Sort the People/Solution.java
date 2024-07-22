//package Leetcode.2418. Sort the People;

// class Solution {
//     public String[] sortPeople(String[] names, int[] heights) {

//         for (int i = 0; i < heights.length; i++) {
//             for (int j = 0; j < heights.length - 1 - i; j++) {
//                 if (heights[j] < heights[j + 1]) {
//                     int temp = heights[j];
//                     heights[j] = heights[j + 1];
//                     heights[j + 1] = temp;

//                     String tempt = names[j];
//                     names[j] = names[j + 1];
//                     names[j + 1] = tempt;

//                 }
//             }
//         }
//         return names;

//     }
// }

import java.util.PriorityQueue;

class Pair {
    String s;
    int h;

    Pair(String s, int h) {
        this.s = s;
        this.h = h;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.h - p1.h);
        for (int i = 0; i < heights.length; i++) {
            pq.add(new Pair(names[i], heights[i]));
        }

        int i = 0;
        while (!pq.isEmpty()) {
            names[i++] = pq.poll().s;
        }
        return names;
    }
}
