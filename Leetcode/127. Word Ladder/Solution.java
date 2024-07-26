//package Leetcode.127. Word Ladder;

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> words = new HashSet<>();
        for (String s : wordList)
            words.add(s);
        if (!words.contains(endWord))
            return 0;

        Queue<String> q = new LinkedList<>();
        int count = 0;
        q.add(beginWord);

        while (!q.isEmpty()) {
            int size = q.size();
            count++;
            for (int i = 0; i < size; i++) {
                String curr = q.poll();
                if (curr.equals(endWord))
                    return count;
                char[] arr = curr.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char original = arr[j];
                    for (int k = 0; k < 26; k++) {
                        arr[j] = (char) (97 + k);
                        String s = new String(arr);
                        if (words.contains(s)) {
                            q.add(s);
                            words.remove(s);
                        }
                    }
                    arr[j] = original;
                }
            }
        }
        return 0;
    }
}
