//package Leetcode.2351. First Letter to Appear Twice;

import java.util.ArrayList;

class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<String> track = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (track.contains("" + s.charAt(i)))
                return s.charAt(i);
            track.add("" + s.charAt(i));
        }

        return s.charAt(0);
    }
}
