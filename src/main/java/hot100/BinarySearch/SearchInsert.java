package hot100.BinarySearch;

/*
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

请必须使用时间复杂度为 O(log n) 的算法。

 

示例 1:

输入: nums = [1,3,5,6], target = 5
输出: 2
示例 2:

输入: nums = [1,3,5,6], target = 2
输出: 1
示例 3:

输入: nums = [1,3,5,6], target = 7
输出: 4
 */

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int res = nums.length;
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }
}
