//package Leetcode.2901. Longest Unequal Adjacent Groups Subsequence II;

import java.util.*;

class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int [] prevIdx = new int[groups.length];
        int [] dp = new int[groups.length];
        Arrays.fill(prevIdx,-1);
        Arrays.fill(dp, 1);
        int max = -1;
        int maxIdx = 0;

        for(int i=1;i<groups.length;i++){
            for(int j=i-1;j>=0;j--){
                if(groups[i]!=groups[j] && dp[j]+1>dp[i] && hamingTest(words[i],words[j])){
                    dp[i] = dp[j]+1;
                    prevIdx[i] = j;
                }
            }
            if(dp[i]>max){
                max = dp[i];
                maxIdx = i;
            }
        }

        List<String> ls = new ArrayList<>();
        int idx = maxIdx;
        while(idx!=-1){
            ls.add(words[idx]);
            idx = prevIdx[idx];
        }
        Collections.reverse(ls);
        return ls;
    }

    public boolean hamingTest(String str1,String str2){
        if (str1.length()!=str2.length()) return false;
        int count = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) count++;
            if(count==2) break;
        }
        return count==1;
    }
}