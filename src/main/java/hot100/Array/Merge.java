package hot100.Array;

/*
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。

请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 方法 1, 直接合并之后排序
        // 方法 2, 双指针p1和p2指向两个数组的头部, 但是需要额外空间
        // 方法 3, 逆序双指针
        int p1 = m - 1, p2 = n - 1;
        int tail = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                nums1[tail--] = nums2[p2--];
            } else if (p2 == -1) {
                nums1[tail--] = nums1[p1--];
            } else if (nums1[p1] >= nums2[p2]) {
                nums1[tail--] = nums1[p1--];
            } else {
                nums1[tail--] = nums2[p2--];
            }
        }

    }
}
