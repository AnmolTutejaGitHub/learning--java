//package Leetcode.2381. Shifting Letters II;

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int [] diff = new int[n];

        for(int[] query : shifts){
            int l = query[0];
            int r = query[1];
            int dir = query[2];

            if(dir==1){
                diff[l]+=1;
                if(r+1<n) diff[r+1]-=1;
            }else{
                diff[l]-=1;
                if(r+1<n) diff[r+1]+=1;
            }
        }

        for(int i=1;i<n;i++) {
            diff[i]+=diff[i-1];
        }

        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int curr = s.charAt(i)-'a';
            int shift = (curr + diff[i])%26;
            if(shift<0) shift+=26;
            char ch = (char) (shift + 'a');
            res.append(ch);
        }

        return res.toString();
    }
}
