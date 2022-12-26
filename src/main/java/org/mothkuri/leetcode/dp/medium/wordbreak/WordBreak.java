package org.mothkuri.leetcode.dp.medium.wordbreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        System.out.println("START");
        WordBreak wb = new WordBreak();
        List<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");
        System.out.println(wb.wordBreak("catsandog", list));
        System.out.println("END");
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);
        boolean[] dict = new boolean[s.length()+1];
        dict[0] = true;

        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(dict[j] && set.contains(s.substring(j,i))){
                    dict[i]=true;
                    break;
                }
            }
        }

        return dict[s.length()];
    }

}
