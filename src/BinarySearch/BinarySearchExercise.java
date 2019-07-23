package BinarySearch;

/**
 * 704. Binary Search
 * Easy
 * @author zhuduan
 * 2019/07/23
 */

public class BinarySearchExercise {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
