// package Leetcode.1582. Special Positions in a Binary Matrix;
class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int rs  = 0;
        int cs = 0;
        int rsArr[] = new int[mat.length];
        int csArr[] = new int[mat[0].length];

        for(int i=0;i<mat.length;i++){
            rs=0;
            for(int j=0;j<mat[0].length;j++){
                rs+=mat[i][j];
            }
            rsArr[i]=rs;
        }

        for(int i=0;i<mat[0].length;i++){
            cs=0;
            for(int j=0;j<mat.length;j++){
                cs+=mat[j][i];
            }
            csArr[i]=cs;
        }


        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(rsArr[i]==1 && csArr[j]==1 && mat[i][j]==1) count++;
            }
        }
        return count;

    }
}
