package org.mothkuri.leetcode.dp.medium.besttimetobuyandsellstock;

public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        System.out.println("START");
        BestTimetoBuyandSellStock btbs = new BestTimetoBuyandSellStock();
        int[] prices = {7,2,5,3,6,4,1,8};
        System.out.println(btbs.maxProfit(prices));
        System.out.println("END");
    }

    public int maxProfit(int[] prices) {
        int profit=0, buy=Integer.MAX_VALUE, i=1;
        int prev =prices[0], curr=0;

        while(i<prices.length){
            curr = prices[i];
            if(prev<curr){
                if(prev < buy){
                    buy = prev;
                }
                profit = Math.max(profit, curr-buy);
            }
            prev=curr;
            i++;
        }

        return profit;
    }
}
