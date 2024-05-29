//package Leetcode.1441. Build an Array With Stack Operations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int j = 0;
        int i = 1;

        while (i <= n && j < target.length) {
            if (target[j] == i) {
                ans.add("Push");
                j++;
            } else {
                ans.add("Push");
                ans.add("Pop");
            }
            i++;
        }
        return ans;
    }
}
