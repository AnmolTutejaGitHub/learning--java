//package Leetcode.942. DI String Match;

class Solution {
    public int[] diStringMatch(String s) {
        int low = 0;
        int high = s.length();

        int arr[] = new int[s.length()+1];
        int idx=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='D') {
                arr[idx++] = high;
                high--;
            }else {
                arr[idx++] = low;
                low++;
            }
        }
        arr[idx] = low;
        return arr;
    }
}
