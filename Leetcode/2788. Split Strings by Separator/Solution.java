//package Leetcode.2788. Split Strings by Separator;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < words.get(i).length(); j++) {
                if (words.get(i).charAt(j) != separator) {
                    ans.append(words.get(i).charAt(j));
                } else if (words.get(i).charAt(j) == separator) {
                    if (!(ans.toString().equals("")))
                        answer.add(ans.toString());
                    // answer.add(ans.toString());
                    ans.setLength(0);
                    // ans.append("");
                }
            }
            if (!(ans.toString().equals("")))
                answer.add(ans.toString());
        }
        return answer;
    }
}
