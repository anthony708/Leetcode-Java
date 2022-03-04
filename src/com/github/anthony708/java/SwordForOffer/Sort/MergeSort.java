package com.github.anthony708.java.SwordForOffer.Sort;

/**
 * Created by Anthony on 16/4/26.
 */

/*
    将两个有序表合并成一个新的有序表, 即待排序的几个子列是有序的, 将有序子列合并为整体有序的序列.
        1. 申请空间, 使其大小成为两个已排序序列之和
        2. 设定两个指针, 最初位置为两个已排序序列的起始位置
        3. 比较两个指针指向的元素, 将较小的元素放入到合并空间, 并移动指针到下一位置
        4. 重复3直到某一序列指针达到队尾
        5. 将另一序列剩下的所有元素加到合并序列队尾
 */

public class MergeSort {
    public static void sort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(array, start, mid);
            sort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int[] newArray = new int[array.length];
        int i = start;
        int j = mid + 1;
        int k = start;

        // 把较小的数先放入新数组
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                newArray[k++] = array[i++];
            } else {
                newArray[k++] = array[j++];
            }
        }

        // 将左边剩余数放入数组
        while (i <= mid) {
            newArray[k++] = array[i++];
        }

        // 将右边剩余数放入数组
        while (j <= end) {
            newArray[k++] = array[j++];
        }

        // 把新数组中的数覆盖原array
        while (start <= end) {
            array[start] = newArray[start++];
        }
    }

    private static void printArray(int[] array) {
        for (int i: array) {
            System.out.print(" " +i+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2,7,8,3,1,6,9};
        sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
