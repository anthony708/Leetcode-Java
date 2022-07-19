package main.java.Array;

/**
 * #88 Merge Sorted Array
 * Easy
 * @author zhuduan
 * 2018/09/11
 */

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,3,5,7,0,0,0};
        int nums2[] = {2,4,6};
        int m = nums1.length - nums2.length;
        int n = nums2.length;
        merge(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length-1; i++) {
            System.out.print(nums1[i]+",");
        }
        System.out.print(nums1[nums1.length-1]);
    }
}
