package wrapup;

import java.util.*;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class majorityElement {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i])) {
        //         map.put(nums[i], map.get(nums[i]) + 1);
        //     } else {
        //         map.put(nums[i], 1);
        //     }
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > nums.length / 2) {
        //         return entry.getKey();
        //     }
        // }
        // return -1;
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
// @lc code=end

