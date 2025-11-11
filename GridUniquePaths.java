import java.util.*;

public class GridUniquePaths{
    public static void main(String[] args){
        int[][] grid = {
            {0,0,0,0},
            {0,1,0,0},
            {0,0,0,0}
        };

        int m = grid.length;
        int n = grid[0].length;

        int result = findPaths(grid,0,0,m,n);

        System.out.println(result);
    }

    static int findPaths(int[][] grid,int x, int y, int m, int n){
        if(x>=m || y>=n || grid[x][y]==1){
            return 0;
        }



        if(x==m-1 && y==n-1){
            return 1;
        }

        int right = findPaths(grid,x,y+1,m,n);
        int down =  findPaths(grid,x+1,y,m,n);

        return right+down;        
    }
}