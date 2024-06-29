import java.util.*;
class Pair{
    int row;
    int col;
    int level;
    Pair(int r,int c,int l){
        this.row = r;
        this.col = c;
        this.level = l;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean [][] vis = new boolean[n][m];
        int [][] res = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0) {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            res[row][col]=curr.level;
            // vis[row][col]=true;

            if(row+1<n && !vis[row+1][col]) {q.add(new Pair(row+1,col,curr.level+1)); vis[row+1][col]=true;}
            if(row-1>=0 && !vis[row-1][col]) {q.add(new Pair(row-1,col,curr.level+1)); vis[row-1][col]=true;}
            if(col+1<m && !vis[row][col+1]) {q.add(new Pair(row,col+1,curr.level+1)); vis[row][col+1]=true;}
            if(col-1>=0 && !vis[row][col-1]) {q.add(new Pair(row,col-1,curr.level+1)); vis[row][col-1]=true;}
        }

        return res;
    }
}