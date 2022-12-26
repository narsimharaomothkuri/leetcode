package org.mothkuri.leetcode.dp.medium.longestvalidparentheses;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        System.out.println("START");
        LongestValidParentheses lvp = new LongestValidParentheses();
        String str = "((()(()";
        System.out.println(lvp.longestValidParentheses(str));
        System.out.println("END");
    }
    public int longestValidParentheses(String s) {

        if(s.length() < 2)
            return  0;

        char[] chr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        // 0  1  2  3
        //[( ,(, ), )]
        for(int i=0; i<chr.length; i++){

            if(chr[i] == '('){
                stack.push(i);
            }else{
                if(stack.size() > 1 && chr[stack.peek()] == '('){
                    stack.pop();
                    max = Math.max(max, i-stack.peek());
                }
            }

        }


        return max;
    }



}
