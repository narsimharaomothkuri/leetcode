package org.mothkuri.leetcode.dp.medium.Interleavingstring;

public class InterleavingString {

    public static void main(String[] args) {
        System.out.println("START");
        InterleavingString is = new InterleavingString();
        String s1="ac", s2="bd", s3="abcz";
        System.out.println(is.isInterleave(s1,s2,s3));
        System.out.println("END");
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if ((s1.length()+s2.length())!=s3.length()) return false;

        boolean[][] matrix = new boolean[s2.length()+1][s1.length()+1];
        matrix[0][0] = true;

        for (int i = 1; i < matrix[0].length; i++){
            matrix[0][i] = matrix[0][i-1]&&(s1.charAt(i-1)==s3.charAt(i-1));
        }

        for (int i = 1; i < matrix.length; i++){
            matrix[i][0] = matrix[i-1][0]&&(s2.charAt(i-1)==s3.charAt(i-1));
        }

        for (int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                matrix[i][j] = (matrix[i-1][j]&&(s2.charAt(i-1)==s3.charAt(i+j-1)))
                        || (matrix[i][j-1]&&(s1.charAt(j-1)==s3.charAt(i+j-1)));
            }
            print(matrix);
            System.out.println();
        }

        return matrix[s2.length()][s1.length()];
    }

    private void print(boolean[][] matrix){
        for(boolean[] mat : matrix){
            for(boolean b : mat){
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }
}
