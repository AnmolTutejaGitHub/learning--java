//package Leetcode.791. Custom Sort String;

import java.util.HashMap;

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            if (map.containsKey(order.charAt(i))) {
                ans.append(("" + order.charAt(i)).repeat(map.get(order.charAt(i))));
                int index = sb.indexOf("" + order.charAt(i));
                if (index >= 0)
                    sb.deleteCharAt(index);
            }

        }

        // ans += sb
        for (int i = 0; i < sb.length(); i++) {
            if (!order.contains("" + sb.charAt(i)))
                ans.append("" + sb.charAt(i));
        }

        return ans.toString();

    }
}

// intution : get freq of char in s , iteragte through order str and concat acc
// in new str

// make map of freq of char in s
// for char in order , if order contains mapkey , add the char freq times in ans
// str
// delete that char from s
// ans+=s
// make sure s also not contains repeted char by using condition s!contain order
