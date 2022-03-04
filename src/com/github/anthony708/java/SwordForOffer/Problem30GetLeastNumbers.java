package com.github.anthony708.java.SwordForOffer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Anthony on 16/5/18.
 */
public class Problem30GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length == 0 || input.length < k || k <= 0) return list;
        if (input.length == k) {
            for (int i: input) {
                list.add(i);
            }
            return list;
        }

        int index = partition(input, 0, input.length - 1);
        int start = 0;
        int end = input.length - 1;
        while (index != k - 1) {
            if (index > k - 1) {
                index = partition(input, start, index - 1);
            } else {
                index = partition(input, index + 1, end);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
    public int partition(int[] input, int start, int end) {
        int i = start - 1;
        int j = start;
        int pivot = input[end];
        while (j != end) {
            if (input[j] < pivot) {
                i++;
                swap(input, i, j);
            }
            j++;
        }
        swap(input, i+1, end);
        return i+1;
    }
    public void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
