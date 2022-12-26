package org.mothkuri.leetcode.dp.easy.climbingstairs;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println("START");
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(4));
        System.out.println("END");
    }

    public int climbStairs(int n) {

        if(n < 1)
            return 0;

        if(n == 1)
            return 1;

        if(n==2)
            return 2;

        int result = climbStairs(n-1) + climbStairs(n-2);

        return result;
    }

}
