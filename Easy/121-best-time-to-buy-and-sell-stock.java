// 121. Best Time to Buy and Sell Stock (Easy)
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Runtime: 1 ms  Memory: 94.5 MB
class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int price : prices){
            if(price < minprice){
                minprice = price;
            }

            if(price - minprice > Maxprofit){
                Maxprofit = price - minprice;
            }
        }
        return Maxprofit;
    }
}
