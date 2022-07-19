package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/14.
 */

import java.util.ArrayList;

public class RotateArray {
    public static int minNumberInRotateArray(int [] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return array[low];
    }

    public static void main(String[] args) {
        int[] array = {5,6,7,1,2,3};
        System.out.println(minNumberInRotateArray(array));
    }
}
