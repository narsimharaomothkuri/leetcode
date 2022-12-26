package org.mothkuri.leetcode.dp.medium.triangle;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        System.out.println("START");
        Triangle t = new Triangle();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);l2.add(4);
        List<Integer> l3 = new ArrayList<>();
        l3.add(6);l3.add(5);l3.add(7);
        List<Integer> l4 = new ArrayList<>();
        l4.add(4);l4.add(1);l4.add(8);l4.add(3);

        List<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        System.out.println(t.minimumTotal(list));
        System.out.println("END");
    }

    public int minimumTotal(List<List<Integer>> triangle) {

        for(int i=triangle.size()-2; i>=0; i--){
            List<Integer> last = triangle.get(i+1);
            List<Integer> curr = triangle.get(i);
            for(int j=0; j<curr.size();j++){
                int currVal = curr.get(j);
                int lIVal = last.get(j);
                int lIPval = last.get(j+1);
                currVal = currVal+lIVal < currVal+lIPval ? currVal+lIVal : currVal+lIPval;
                curr.remove(j);
                curr.add(j, currVal);
            }
        }

        return triangle.get(0).get(0);
    }

}
