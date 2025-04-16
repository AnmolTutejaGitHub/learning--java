//package Leetcode.187. Repeated DNA Sequences;

import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> res = new HashSet<>();

        for(int i=0;i<=s.length()-10;i++){
            String curr = s.substring(i,i+10);
            if(seen.contains(curr)) res.add(curr);
            else seen.add(curr);
        }
        return new ArrayList<>(res);
    }
}