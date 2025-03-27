package hot100;

/*
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。

请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。

 

示例 1:

输入: [3,2,1,5,6,4], k = 2
输出: 5
示例 2:

输入: [3,2,3,1,2,4,5,5,6], k = 4
输出: 4

 */

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        //第 k个最大的数, 堆排序找到第 k 个
        int n = nums.length - 1;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }
        int res = 0;
        for (int i = n - 1; i >= (n - k); i--) {
            swap(nums, i, 0);
            heapify(nums, i, 0);
            if (i == n - k) {
                res = nums[i];
            }
        }
        return res;
    }

    public static void heapify(int[] nums, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (nums[largest] < nums[left]) {
            largest = left;
        }
        if (nums[largest] < nums[right]) {
            largest = right;
        }
        if (largest != i) {
            swap(nums, largest, i);
            heapify(nums, heapSize, largest);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
