import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            int[] tmp = new int[i + 1];
            tmp[0] = 1;
            tmp[i] = 1;
            for (int j = 1; j < i; j++) {
                tmp[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            pascal[i] = tmp;
        }
        return (List)Arrays.asList(pascal);
    }
}
// @lc code=end

