package org.mothkuri.leetcode.dp.medium.uniquepaths;

import java.util.ArrayList;
import java.util.List;

public class UniquePaths {

    static int noTimes = 0;
    public static void main(String[] args) {
        System.out.println("START");
        UniquePaths up = new UniquePaths();
        System.out.println(up.uniquePaths(4,8));
        System.out.println(noTimes);
        System.out.println("END");
    }

    public int uniquePaths(int m, int n) {

        /**
        if(m == 1 && n == 1){
            return 1;
        }
        int sum = 0;
        if(m > 0)
            sum += uniquePaths(m-1, n);
        if(n > 0)
            sum += uniquePaths(m, n-1);
        noTimes++;
        return sum;
        */

        /**
        int[][] grid = new int[m][n];

        for(int i=0; i<m; i++){
            grid[i][0] = 1;
        }

        for(int j=0; j<n; j++){
            grid[0][j] = 1;
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] = grid[i-1][j]+grid[i][j-1];
            }
        }

        return grid[m-1][n-1];
        */

        return uniquePaths(m,n, new int[m+1][n+1]);
    }

    //Memoriziation Approch
    public int uniquePaths(int m, int n, int[][] nums){
        if(m==1 && n==1){
            return 1;
        }

        if(m==0 || n==0)
            return 0;

        if( nums[m][n] != 0){
            return nums[m][n];
        }

        nums[m][n] = uniquePaths(m-1, n, nums) + uniquePaths(m, n-1, nums);

        return nums[m][n];
    }
}
