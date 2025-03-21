package wrapup;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class getRow {
    public List<Integer> getRow(int rowIndex) {
        // 每一行从后向前遍历, 利用 res[j] = res[j] + res[j - 1]
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; i++) {
            res.add(1);
            for (int j = i - 1 ; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }
}
// @lc code=end

