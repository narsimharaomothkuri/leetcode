
package org.mothkuri.leetcode.dp.medium.palindromepartitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    List<List<String>> res = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("START");
        PalindromePartitioning pp = new PalindromePartitioning();
        pp.partition("aab");
        System.out.println("END");
    }

    public List<List<String>> partition(String s) {
        List<String> result = new ArrayList<>();
        int index = 0;
        String str = "";
        partition(s, index, index, result, str);
        System.out.println(result);
        System.out.println(res);
        return null;
    }

    public void partition(String s, int start, int index, List<String> result, String str){

        if(!str.isEmpty() && isPalindrome(str)){
            result.add(str);
        }

        if(index >= s.length()){
            return;
        }


        for(int i=index; i<s.length(); i++){
            partition(s,start, i+1, result, s.substring(start, i+1));
            //List<String> list = new ArrayList<>(result);
            //result = new ArrayList<>();
            //res.add(list);
            start++;
        }
    }

    public boolean isPalindrome(String str){
        int s = 0;
        int e = str.length()-1;
        boolean palindrome = true;

        while(s<=e){
            if(str.charAt(s) != str.charAt(e)){
                palindrome = false;
                break;
            }
            s++;
            e--;
        }

        return palindrome;
    }
}