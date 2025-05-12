//package Leetcode.2094. Finding 3-Digit Even Numbers;

import java.util.ArrayList;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=100;i<999;i+=2){
            if(isPossible(digits,i)) res.add(i);
        }
        
        int arr[] = new int[res.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = res.get(i);
        }
        return arr;
    }

    public boolean isPossible(int[]digits,int i){
        int a = i%10;
        i=i/10;
        int b = i%10;
        i=i/10;
        int c =i%10;

        int count = 0;

        for(int j=0;j<digits.length;j++){
            if(digits[j]==a){
                count++;
                a = -1;
            }
            else if (digits[j]==b){
                count++;
                b = -1;
            }
            else if(digits[j]==c){
                count++;
                c = -1;
            }
        }
        return count==3;
    }
}