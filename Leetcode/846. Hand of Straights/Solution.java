//package Leetcode.846. Hand of Straights;

import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (groupSize == 1)
            return true;
        if (hand.length % groupSize != 0)
            return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

        while (map.size() != 0) {
            int curr = map.firstKey();
            curr -= 1;
            int count = 0;
            List<Integer> ls = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                if (key != curr + 1)
                    return false;
                curr += 1;

                // map.put(key,map.get(key)-1);
                // if(map.get(key)==0) map.remove(key);
                ls.add(key);

                count++;
                if (count == groupSize)
                    break;
            }
            for (int key : ls) {
                map.put(key, map.get(key) - 1);
                if (map.get(key) == 0)
                    map.remove(key);
            }
            if (count != groupSize)
                return false;
        }
        return true;
    }
}
