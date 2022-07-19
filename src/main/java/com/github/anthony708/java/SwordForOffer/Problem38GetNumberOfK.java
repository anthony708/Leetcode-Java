package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/9/12.
 */

/*
     统计一个数字在排序数组中出现的次数
        二分查找, 时间复杂度O(logn)
 */

public class Problem38GetNumberOfK {
    public static int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) return -1;
        int first = getFirstK(array, k, 0, array.length - 1);
        int last = getLastK(array, k, 0, array.length - 1);
        return last - first + 1;
    }
    public static int getFirstK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (start == end - 1) {
            if (array[start] == k) {
                return start;
            } else {
                return end;
            }
        }
        int mid = (start + end) / 2;
        if (array[mid] == k) {
            if ((mid > 0 && array[mid - 1] != k) || mid == 0) {
                return mid;
            } else {
                end = mid - 1;
            }
        } else  if (array[mid] > k) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return getFirstK(array, k, start, end);
    }
    public static int getLastK(int[] array, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (start == end - 1) {
            if (array[end] == k) {
                return end;
            } else {
                return start;
            }
        }
        int mid = (start + end) / 2;
        if (array[mid] == k) {
            if ((mid < array.length - 1 && array[mid + 1] != k) || mid == array.length - 1) {
                return mid;
            } else {
                start = mid + 1;
            }
        } else if (array[mid] > k) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return getLastK(array, k, start, end);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(array, 3));
    }
}
