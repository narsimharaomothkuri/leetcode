package org.mothkuri.leetcode.dp.medium.minimumpathsum;

public class MinimumPathSum {

    public static void main(String[] args) {
        System.out.println("START");
        MinimumPathSum mps = new MinimumPathSum();

        int[][] grid = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(mps.minPathSum(grid));
        System.out.println("END");
    }

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        //row sum
        for(int i=1; i<m; i++){
            grid[i][0] += grid[i-1][0];
        }

        //column sum
        for(int j=1; j<n; j++){
            grid[0][j] += grid[0][j-1];
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        return grid[m-1][n-1];
    }
}
