
//package Leetcode.1539. Kth Missing Positive Number;
// //
import java.util.ArrayList;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int ans = -1;
        ArrayList<Integer> missing = new ArrayList<>();
        boolean flag = false;
        // for(int j=1;j<100 ; j++)
        for (int j = 1; j < (arr.length + k + 1); j++) {
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == j) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                missing.add(j);
        }
        System.out.println(missing);
        return missing.get(k - 1);
    }
}