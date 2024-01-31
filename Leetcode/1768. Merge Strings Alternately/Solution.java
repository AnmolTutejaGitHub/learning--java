//package Leetcode.1768. Merge Strings Alternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String[] words1 = word1.split("");
        String[] words2 = word2.split("");
        String[] ans = new String[words1.length + words2.length];
        int ind1 = 0;
        int ind2 = 0;

        for (int i = 0; i < ans.length; i++) {

            if (i % 2 == 0 && ind1 < words1.length)
                ans[i] = words1[ind1++];
            else if (i % 2 != 0 && ind2 < words2.length)
                ans[i] = words2[ind2++];

            else if (ind2 < words2.length && ind1 >= words1.length)
                ans[i] = words2[ind2++];
            else if (ind1 < words1.length && ind2 >= words2.length)
                ans[i] = words1[ind1++];
        }
        return String.join("", ans);

    }
}
