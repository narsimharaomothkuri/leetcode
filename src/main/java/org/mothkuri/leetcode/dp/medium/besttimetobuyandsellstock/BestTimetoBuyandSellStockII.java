package org.mothkuri.leetcode.dp.medium.besttimetobuyandsellstock;

import org.jetbrains.annotations.NotNull;

public class BestTimetoBuyandSellStockII {

    public static void main(String[] args) {
        System.out.println("START");
        BestTimetoBuyandSellStockII bbss = new BestTimetoBuyandSellStockII();
        int[] pirces = {7,1,5,3,6,4};
        System.out.println(bbss.maxProfit(pirces));
        System.out.println("END");
    }

    public int maxProfit(@NotNull int[] prices) {
        int length=prices.length-1;
        int i=0, buy=0, sell=0, profit=0;


        while(i<length){

            while(i<length && prices[i+1] <= prices[i])
                i++;
            buy=prices[i];

            while(i<length && prices[i+1] > prices[i])
                i++;
            sell=prices[i];

            profit = profit + (sell-buy);

        }
        return profit;
    }
}
