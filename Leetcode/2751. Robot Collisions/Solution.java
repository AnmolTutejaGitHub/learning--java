//package Leetcode.2751. Robot Collisions;

import java.util.*;

class Pair {
    int pos;
    int health;
    char dir;

    Pair(int pos, int health, char dir) {
        this.pos = pos;
        this.health = health;
        this.dir = dir;
    }
}

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<Pair> st = new Stack<>();
        Pair[] arr = new Pair[positions.length];
        Map<Integer, Integer> posIdx = new HashMap<>();

        for (int i = 0; i < positions.length; i++) {
            arr[i] = new Pair(positions[i], healths[i], directions.charAt(i));
            posIdx.put(positions[i], i);
        }

        Arrays.sort(arr, (p1, p2) -> p1.pos - p2.pos);

        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || arr[i].dir == 'R')
                st.push(arr[i]);
            else {
                while (!st.isEmpty() && st.peek().dir == 'R' && arr[i].health != 0) {
                    if (arr[i].health > st.peek().health) {
                        st.pop();
                        arr[i].health--;
                    } else if (arr[i].health < st.peek().health) {
                        st.peek().health--;
                        arr[i].health = 0;
                    } else if (arr[i].health == st.peek().health) {
                        st.pop();
                        arr[i].health = 0;
                    }
                }
                if (arr[i].health != 0)
                    st.push(arr[i]);
            }
        }

        int[] res = new int[positions.length];
        while (!st.isEmpty()) {
            res[posIdx.get(st.peek().pos)] = st.pop().health;
        }

        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0)
                ls.add(res[i]);
        }

        return ls;
    }
}
