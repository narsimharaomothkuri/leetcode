package org.mothkuri.leetcode.dp.medium.decodeways;

public class DecodeWays {

    public static void main(String[] args) {
        System.out.println("START");

        DecodeWays dw = new DecodeWays();
        System.out.println(dw.numDecodings("2225"));

        System.out.println("END");
    }

    public int numDecodings(String s) {

        int num1, num2, count=0;

        char[] chrs = s.toCharArray();

        int len = chrs.length-1;

        int[] ways = new int[len+1];
        ways[0] = 1;

        for(int i=1; i<=len; i++){

            num1 = getIntValue(chrs[i-1]);
            //num2 = i <= len-1 ? getIntValue(chrs[i])*10+getIntValue(chrs[i+1]) : 0;
            num2 = num1*10+getIntValue(chrs[i]);

            System.out.println(num1+"\t"+num2);
            if(num1>0 && num1<10){
                count++;
                ways[i] += ways[i-1];
            }

            if(num2>9 && num2<27){
                count++;
                ways[i] += ways[i-1];
            }

        }

        return count;
    }

    private int getIntValue(char ch){
        switch (ch){
            case '1' : return 1;
            case '2' : return 2;
            case '3' : return 3;
            case '4' : return 4;
            case '5' : return 5;
            case '6' : return 6;
            case '7' : return 7;
            case '8' : return 8;
            case '9' : return 9;
            default: return 0;
        }
    }

}
