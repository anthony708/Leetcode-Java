package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * #349 Intersection of Two Arrays
 * Easy
 * @author zhuduan
 * 2018/11/19
 */

public class IntersectionofTwoArrays {
    public int[] itersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            if (binarySearch(nums2, nums1[i])) {
                set.add(nums1[i]);
            }
        }
        int [] result = new int[set.size()];
        int k = 0;
        for (Integer num: set) {
            result[k++] = num;
        }
        return result;
    }

    private boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
