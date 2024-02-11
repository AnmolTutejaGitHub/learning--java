//package Leetcode.1859. Sorting the Sentence;

class Solution {
    public String sortSentence(String s) {

        String[] str = s.split("\\s+");
        String[] ans = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            ans[Integer.parseInt("" + str[i].charAt(str[i].length() - 1)) - 1] = str[i].substring(0,
                    str[i].length() - 1);
        }

        return String.join(" ", ans);

    }
}
