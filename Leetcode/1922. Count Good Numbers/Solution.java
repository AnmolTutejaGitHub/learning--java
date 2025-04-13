//package Leetcode.1922. Count Good Numbers;

class Solution {
    static int MOD = 1000000007;
    public int countGoodNumbers(long n) {
      long odd_indexes = (n/2);
      long even_indexes = (n+1)/2;

      long even_index_choices =  pow(5,even_indexes);
      long odd_index_choices = pow(4,odd_indexes);

      return (int)((even_index_choices*odd_index_choices)%MOD);
    }

    public long pow(long base,long exp){
        if(exp==0 || base==1) return 1;
        
        if(exp<0){
            exp = -exp;
            base = 1/base;
        }

        long half = pow(base,exp/2);
        if(exp%2==0) return (half*half)%MOD;
        return (base*half*half)%MOD;
    }
}
