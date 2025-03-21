package wrapup;/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // wrapup.merge sort, Time complexity: O(m+n), Space complexity: O(1)
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >=0) {
            if (i >=0 & j >=0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
// @lc code=end

