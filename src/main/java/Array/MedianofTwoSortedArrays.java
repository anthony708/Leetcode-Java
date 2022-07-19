package Array;

/**
 *
 * 4. Median of Two Sorted Arrays
 * Hard
 * @author zhuduan
 * 2019/06/19
 */

public class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArray(nums1, nums2);

        double mid = 0;
        if (mergedArray.length % 2 == 1) {
            mid = mergedArray[mergedArray.length / 2];
        } else {
            double mid1 = mergedArray[mergedArray.length / 2];
            double mid2 = mergedArray[mergedArray.length / 2 - 1];
            mid = (mid1 + mid2) / 2;
        }

        return mid;
    }

    private static int[] mergeArray(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {2,3};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
