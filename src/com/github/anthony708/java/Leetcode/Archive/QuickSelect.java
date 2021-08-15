package com.github.anthony708.java.Leetcode.Archive;

/**
 * Created by Anthony on 16/1/6.
 */
public class QuickSelect {

    private final static int CUTOFF = 10;

    private static int median3(int[] s, int left, int right) {
        int center = (left + right) / 2;
        if (s[center] < s[left]) swap(s, left, center);
        if (s[right] < s[left]) swap(s, left, right);
        if (s[right] < s[center]) swap(s, center, right);
        swap(s, center, right - 1);
        return s[right - 1];
    }

    private static void swap(int[] s, int a, int b) {
        int temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    private static void insertSort(int[] s, int left, int right) {
        int j;
        for (int i = left + 1; i <= right; i++) {
            int temp = s[i];
            for (j = i; j > left && temp < s[j - 1]; j--) {
                s[j] = s[j - 1];
            }
            s[j] = temp;
        }
    }

    public static int QuickSelect(int s[], int k) {
        QuickSelect(s, k, 0, s.length - 1);
        return s[k - 1];
    }

    public static void QuickSelect(int s[], int k, int left, int right) {
        if (left + CUTOFF <= right) {
            int pivot = median3(s, left, right);

            int i = left;
            int j = right - 1;
            for ( ; ; ) {
                while (s[++i] < pivot) {}
                while (s[--j] > pivot) {}

                if (i < j) {
                    swap(s, i, j);
                } else {
                    break;
                }

                swap(s, i, right - 1);

                if (k <= i) {
                    QuickSelect(s, k, left, i - 1);
                } else  {
                    QuickSelect(s, k, i + 1, right);
                }
            }
        } else {
            insertSort(s, left, right);
        }

    }

    public static void main(String[] args) {
        int[] s = {2, 3, 6, 1, 4, 7, 5};
        int k = 4;
        System.out.println(QuickSelect(s, k));
    }
}
