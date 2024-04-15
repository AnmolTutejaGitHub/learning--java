//package Leetcode.2024. Maximize the Confusion of an Exam;
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int count[] = new int[2];
        int MaxLen = 0;

        int s = 0;
        for (int e = 0; e < answerKey.length(); e++) {
            char ch = answerKey.charAt(e);
            if (ch == 'T')
                count[0]++;
            else
                count[1]++;

            while (count[0] > k && count[1] > k) {
                if (answerKey.charAt(s) == 'T')
                    count[0]--;
                else
                    count[1]--;
                s++;
            }
            if (count[0] <= k || count[1] <= k)
                MaxLen = Math.max(MaxLen, e - s + 1);
        }
        return MaxLen;
    }
}