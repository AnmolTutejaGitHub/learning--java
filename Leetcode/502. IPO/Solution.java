
//package Leetcode.502. IPO;
import java.util.*;

class Pair {
    int a;
    int b;
    int i;

    Pair(int a, int b, int i) {
        this.a = a;
        this.b = b;
        this.i = i;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Pair[] pair = new Pair[profits.length];
        for (int i = 0; i < profits.length; i++)
            pair[i] = new Pair(capital[i], profits[i], i);
        Arrays.sort(pair, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                int com = Integer.compare(p1.a, p2.a);
                if (com == 0)
                    return Integer.compare(p2.b, p1.b);
                return com;
            }
        });

        // for(int i=0;i<pair.length;i++){
        // if(k==0) break;
        // if(pair[i].a<=w) {w+=pair[i].b;
        // k--;
        // }
        // }

        PriorityQueue<Pair> pq = new PriorityQueue<>(comp);
        int i = 0;
        if (k > capital.length)
            k = capital.length;
        while (k > 0) {
            while (i < pair.length && pair[i].a <= w) {
                pq.add(pair[i]);
                i++;
            }
            if (pq.isEmpty())
                break;
            w += pq.poll().b;
            k--;
        }
        return w;
    }

    Comparator comp = new Comparator<Pair>() {
        public int compare(Pair p1, Pair p2) {
            return Integer.compare(p2.b, p1.b);
        }
    };
}

// intution : sort the capital, maintain relative order of profit(use classes)
// greadity find maxProfit .. one problem my commented greedy approach is
// failing to look
// afterwards.... test case : k = 1 w =2 profits =[1,2,3]capital =[1,1,2] so i
// need
// to check till
// I gets maxprofit and it capital[i] is <= w ... so store all possible in pq
// and got maximum
