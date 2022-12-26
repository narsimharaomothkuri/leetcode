package org.mothkuri.leetcode.dp.hard.editdistance;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println("START");

        EditDistance ed = new EditDistance();
        String word1 = "intention";
        String word2 = "execution";

        System.out.println(ed.minDistance(word1, word2));

        System.out.println("END");
    }

    public int minDistance(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int m = w1.length;
        int n = w2.length;

        int[][] nums = new int[m+1][n+1];

        //row
        for(int i=0; i<=m; i++){
            nums[i][0] = 1;
        }

        //col
        for(int j=0; j<=n; j++){
            nums[0][j] = 1;
        }

        nums[0][0] = 0;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(w1[i-1]==w2[j-1]){
                    nums[i][j] = nums[i-1][j-1];
                }else{
                    nums[i][j] = Math.min(nums[i-1][j-1], Math.min(nums[i-1][j], nums[i][j-1]))+1;
                }
            }
            print(nums);
        }
        return nums[m][n];

    }

    private void print(int[][] nums){
        for(int[] num:nums){
            for(int n:num){
                System.out.print(n+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
