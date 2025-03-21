package wrapup;

import java.util.HashMap;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i: nums) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

