package com.github.anthony708.java.SwordForOffer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Anthony on 16/5/20.
 */

/*
    输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。

 */
public class Problem33PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) return "";
        String[] str = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        quickSort(str, 0, str.length - 1);
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }

    public int partition(String[] array, int start, int end) {
        int i = start - 1;
        String pivot = array[end];
        for (int j = start; j < end; j++) {
            if (compare(array[j], pivot) < 0) {
                swap(array, ++i, j);
            }

        }
        swap(array, i+1, end);
        return i+1;
    }
    public void quickSort(String[] array, int start, int end) {
        int pivot;
        if (start < end) {
            pivot = partition(array, start, end);
            quickSort(array, start, pivot -1);
            quickSort(array, pivot + 1, end);
        }
    }
    public int compare(String m, String n) {
        String mn = m + n;
        String nm = n + m;
        return mn.compareTo(nm);
    }
    private static void swap(String[] array, int a, int b) {
        String temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }
}
