/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            }
            maxProfit = prices[i] - prices[min] > maxProfit ? prices[i] - prices[min] : maxProfit;
            
        }
        return maxProfit > 0 ? maxProfit : 0;
    }
}
// @lc code=end

