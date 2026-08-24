// 122. Best Time to Buy and Sell Stock II (Medium)
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Runtime: 0 ms  Memory: 46.4 MB
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxprofit = maxprofit + prices[i] - prices[i-1];
            }
        }
        return maxprofit;
    }
}
