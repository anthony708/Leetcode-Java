package hot100.Array;

import java.util.Arrays;

/*
 * 有两个无序数组, 将它们合并成一个有序数组并且去重
 */

public class MergeAndSort {
    public static int[] mergeAndSort(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        quickSort(nums1, 0, m - 1);
        quickSort(nums2, 0, n - 1);
        
        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                if (k == 0 || res[k - 1] != nums1[i]) {
                    res[k++] = nums1[i++];
                }
            } else if (nums1[i] > nums2[j]) {
                if (k == 0 || res[k - 1] != nums2[j]) {
                    res[k++] = nums2[j++];
                }
            } else {
                if (k == 0 || res[k-1] != nums1[i]) res[k++] = nums1[i];
                i++;
                j++;
            }
        }

        while (i < m) {
            if (k == 0 || res[k - 1] != nums1[i]) {
                res[k++] = nums1[i++];
            }
        }
        while (j < n) {
            if (k == 0 || res[k - 1] != nums2[j]) {
                res[k++] = nums2[j++];
            }
        }

        // for (int item: res) {
        //     System.out.println(item);
        // }
        return Arrays.copyOf(res, k);
    }


    private static void quickSort(int[] nums, int low, int high) {
        if(low < high) {
            int partition = partition(nums, low, high);
            quickSort(nums, low, partition - 1);
            quickSort(nums, partition + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, pointer);
                pointer++;
            }
        }
        swap(nums, pointer, high);
        return pointer;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {5,1,7,3,8};
        int[] nums2 = {6,4,3,1,9};
        System.out.println(Arrays.toString(mergeAndSort(nums1, nums2)));
    }
}
