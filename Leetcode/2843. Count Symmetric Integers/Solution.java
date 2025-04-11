//package Leetcode.2843. Count Symmetric Integers;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i)) count++;
        }
        return count;
    }
    public boolean isSymmetric(int n){
        String str =n+"";
        if(str.length()%2!=0) return false;
        int s = 0;
        int e = str.length()-1;
        int sum_s = 0;
        int sum_e = 0;
        while(s<e){
            sum_s+=Integer.valueOf(str.charAt(s));
            sum_e+=Integer.valueOf(str.charAt(e));
            s++;
            e--;
        }
        return sum_s == sum_e;
    }
}