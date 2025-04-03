package hot100.DP;

/*
 * 给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。

完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。

 

示例 1：

输入：n = 12
输出：3 
解释：12 = 4 + 4 + 4
示例 2：

输入：n = 13
输出：2
解释：13 = 4 + 9
 */

public class NumSquares {
    public int numSquares(int n) {
        // f(i) 表示最少需要多少个完全平方数, 落在[0, i^1/2] 区间内
        // 假设枚举到 j, 还需要 i - j²
        // 边界条件 f(0) = 0
        // 上一个数n - j * j 所对应的完全平方数最少数量 f[n - j * j]

        int[] f = new int[n + 1];
        f[0] = 0;
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }
}
