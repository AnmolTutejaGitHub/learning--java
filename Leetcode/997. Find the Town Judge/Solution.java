//package Leetcode.997. Find the Town Judge;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustedByHowMany = new int[n];
        int[] trustSomeOne = new int[n];

        for (int i = 0; i < trust.length; i++) {
            trustedByHowMany[trust[i][1] - 1]++; // -1 for fixing indexing
            trustSomeOne[trust[i][0] - 1]++;
        }

        for (int i = 0; i < trustedByHowMany.length; i++) {
            if (trustedByHowMany[i] == n - 1 && trustSomeOne[i] == 0)
                return i + 1;
        }
        return -1;
    }
}

// intution :
// created array of all called trustedByHowMany
// if trustedByHowMany[i]>0 person is suspected for town judge
// if he is trustedByHowMany = n-1 as he don't trust himself && his trust nobody
// he is town judge