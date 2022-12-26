package org.mothkuri.leetcode.dp.medium.longestpalindromicsubstring;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println("START");

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String s = "asefabaabaud";
        System.out.println(lps.longestPalindrome(s));
        System.out.println("END");
    }

    public String longestPalindrome(String s) {

        int length = 1;
        int start = 0;

        for(int i=0; i<s.length(); i++){
            int temp = Math.max(getLength(s, i, i), getLength(s, i, i+1));

            if(temp > length){
                length = temp;
                start = i - (temp-1)/2;
            }
        }

        return s.substring(start, start+length);

    }

    private int getLength(String str, int start, int end){
        if(start < 0 || end > str.length())
            return 0;
        int length = start == end ? -1 : 0;

        while(start > -1 && end < str.length() ){

            if(str.charAt(start) != str.charAt(end))
                break;

            length += 2;
            start--;
            end++;
        }

        return length;
    }


}
