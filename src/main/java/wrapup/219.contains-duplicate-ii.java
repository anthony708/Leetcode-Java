package wrapup;

import java.util.HashMap;

/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // hashmap key表示 数组元素的值, value 表示数组下标

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if ((i - hashMap.get(nums[i])) <= k) {
                    return true;
                }  
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }
}
// @lc code=end

