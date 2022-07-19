/*
 * @Author: Anthony
 * @Date: 2021-08-30 23:38:51
 * @LastEditTime: 2021-08-30 23:54:55
 */
package com.github.anthony708.java.LeetCode.TwoPoints;

/**
 * 88. Merge Sorted Arrays
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 *      为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * 
 * 分析:
 *     两个指针分别指向两个数组的末尾m 和 n的位置, 同时需要第三个指针指向 m + n - i的位置, 依次将两个数组中较大的数字放到nums1的最后 
 *     同时, 如果nums1先遍历结束, 则需要将nums2其余数字依次复制过来; 但如果nums2先遍历完, 则无需动nums1的剩余数字
 */

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        while (m >= 0 && n >= 0) {
            if (nums2[n-1] > nums1[m-1]) {
                nums1[p] = nums2[n-1];
                p--;
                n--;
            } else {
                nums1[p] = nums1[m-1];
                p--;
                m--;
            }
        }
        while (n > 0) {
            nums1[p] = nums2[n-1];
            p--;
            n--;
        }
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int i: nums1) {
            System.out.println(i);
        }
    }
}
