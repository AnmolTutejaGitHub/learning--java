//package Leetcode.881. Boats to Save People;

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int s = 0;
        int e = people.length - 1;

        while (s <= e) {
            if (people[s] + people[e] <= limit) {
                s++;
                e--;
                count++;
            }

            else if (people[e] <= limit) {
                e--;
                count++;
            }
        }
        return count;
    }
}
