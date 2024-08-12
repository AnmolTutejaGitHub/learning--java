// package Leetcode.433. Minimum Genetic Mutation;

import java.util.*;

class Pair {
    String str;
    int count;

    Pair(String str, int count) {
        this.str = str;
        this.count = count;
    }
}

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<Pair> q = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        for (String s : bank)
            set.add(s);
        q.add(new Pair(startGene, 0));

        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                String curr = q.peek().str;
                int count = q.poll().count;
                if (curr.equals(endGene))
                    return count;
                char[] mutant = { 'A', 'C', 'G', 'T' };
                char[] currArr = curr.toCharArray();
                for (int j = 0; j < currArr.length; j++) {
                    for (char ch : mutant) {
                        char temp = currArr[j];
                        currArr[j] = ch;
                        String str = new String(currArr);
                        if (set.contains(str)) {
                            q.add(new Pair(str, count + 1));
                            set.remove(str);
                        }
                        currArr[j] = temp;
                    }
                }
            }
        }
        return -1;
    }
}