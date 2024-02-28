//package Leetcode.997. Find the Town Judge;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] suspectedTJ = new int[n];
        int[] trustSomeOne = new int[n];

        for (int i = 0; i < trust.length; i++) {
            suspectedTJ[trust[i][1] - 1]++; // -1 for fixing indexing
            trustSomeOne[trust[i][0] - 1]++;
        }

        for (int i = 0; i < suspectedTJ.length; i++) {
            if (suspectedTJ[i] == n - 1 && trustSomeOne[i] == 0)
                return i + 1;
        }
        return -1;
    }
}

// intution :
// created array of all called suspected
// if suspected[i]>0 person is suspected for town judge // increamenting it from
// no given to it
// if person is suspected check if it is at trust[0] , if not he is TJ // or why
// not just check if he is trusted by all others ie his val == n-1 // -1 as he
// is don't trust himself given'
// this intuttion is failing for [[1,3],[2,3],[3,1]]. // so create a list of
// trust someone if both his trust some is 0 and his spectectedTJ (people trust
// him) is n-1 he is TJ
