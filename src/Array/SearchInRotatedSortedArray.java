package Array;

import Util.Sort.BinarySearch;

/**
 *
 * #33. Search in Rotated Sorted Array
 * Medium
 * @author zhuduan
 * 2019/04/28
 *
**/

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= nums[high]) {
                int index = BinarySearch.binarySearch(nums, target, low, mid);
                if (index != -1) return index;
                low = mid + 1;
            } else {
                int index = BinarySearch.binarySearch(nums, target, mid, high);
                if (index != -1) return index;
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}