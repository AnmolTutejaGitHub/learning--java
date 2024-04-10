//package Leetcode.950. Reveal Cards In Increasing Order;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans = new int[deck.length];

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < deck.length; i++)
            queue.add(i);

        int ptr = 0;
        int i = 0;
        while (!queue.isEmpty()) {
            if (ptr % 2 == 0)
                ans[queue.remove()] = deck[i++];
            else
                queue.add(queue.remove());
            ptr++;
        }

        return ans;
    }
}