/*
 * @Author: Anthony
 * @Date: 2021-08-21 18:16:21
 * @LastEditTime: 2021-08-21 18:32:28
 */

package com.github.anthony708.java.LeetCode.Greedy;

/**
 * 122. 买卖股票的最佳时机 II
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *  
 * 分析: 
 * 因为可以多次买卖, 则只要price[i + 1] > price[i] 则就可以买入和卖出
*/

class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfix = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfix += prices[i] - prices[i - 1];
            }
        }

        return maxProfix;
    }
}