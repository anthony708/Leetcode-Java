package wrapup;/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class removeElement {
    public static int removeElement(int[] nums, int val) {
        // 定义双指针, 一个 i 表示当前不含 val数组的最后一位, 一个 j 表示遍历数组
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

}
// @lc code=end

