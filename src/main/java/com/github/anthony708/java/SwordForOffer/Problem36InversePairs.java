package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/6/15.
 */

/*
    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P
 */

public class Problem36InversePairs {
    public static int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return sort(array, 0, array.length - 1);
    }

    public static int sort(int [] array, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = (start + end) / 2;
        int left = sort(array, start, mid);
        int right = sort(array, mid + 1, end);
        int count = merge(array, start, mid, end);
        return (left + right + count) % 1000000007;
    }

    public static int merge(int[] array, int start, int mid, int end) {
        int i = mid;
        int j = end;
        int k = end - start;
        int count = 0;
        int[] newArray = new int[end - start + 1];
        while (i >= start && j >= mid + 1) {
            if (array[i] > array[j]) {
                newArray[k--] = array[i--];
                count += j - mid;
                if (count > 1000000007) {
                    count %= 1000000007;
                }
            } else {
                newArray[k--] = array[j--];
            }
        }
        while (i >= start) {
            newArray[k--] = array[i--];
        }
        while (j >= mid + 1) {
            newArray[k--] = array[j--];
        }
        int x = 0;
        while (start <= end) {
            array[start++] = newArray[x++];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,0};
        int count = InversePairs(array);
        System.out.println(count);
        System.out.println(Integer.MAX_VALUE > 1000000007);
    }
}
