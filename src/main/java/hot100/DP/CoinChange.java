package hot100.DP;

import java.util.Arrays;

/*
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。

计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。

你可以认为每种硬币的数量是无限的。

 

示例 1：

输入：coins = [1, 2, 5], amount = 11
输出：3 
解释：11 = 5 + 5 + 1
示例 2：

输入：coins = [2], amount = 3
输出：-1
示例 3：

输入：coins = [1], amount = 0
输出：0

 */

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = min(dp[i - cj]) + 1
        // 即第 j枚硬币的面值 cj, 需要从i - cj这个状态转移过来, 并且加上一枚硬币的贡献

        int max = amount + 1;
        int[] dp = new int[amount + 1];
        
        // 初始化为总金额
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];

    }
}
