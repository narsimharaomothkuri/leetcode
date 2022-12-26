package org.mothkuri.leetcode.dp.medium.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args){
        System.out.println("START");

        GenerateParentheses gp = new GenerateParentheses();

        System.out.println(gp.generateParenthesis(2));

        System.out.println("END");
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n,0, "", result);
        return result;
    }

    private void generateParenthesis(int open, int close, String str, List<String> result){
        if(open == 0 && close == 0){
            result.add(str);
            return;
        }

        if(open > 0)
            generateParenthesis(open-1, close+1, str+"(", result);
        if(close > 0)
            generateParenthesis(open, close-1, str+")", result);
    }
}
