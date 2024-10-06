//package Leetcode.1813. Sentence Similarity III;

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.equals(sentence2))
            return true;

        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

        String[] longest = s1.length > s2.length ? s1 : s2;
        String[] smallest = s1.length < s2.length ? s1 : s2;

        int s = 0;
        int e1 = longest.length - 1;
        int e2 = smallest.length - 1;

        if (smallest.length == 1 && longest.length != 1)
            return (smallest[0].equals(longest[0]) || smallest[0].equals(longest[e1]));

        while (s < smallest.length && smallest[s].equals(longest[s]))
            s++;

        while (e2 >= s && longest[e1].equals(smallest[e2])) {
            e1--;
            e2--;
        }

        if (e2 >= s)
            return false;
        return s <= e1;
    }
}