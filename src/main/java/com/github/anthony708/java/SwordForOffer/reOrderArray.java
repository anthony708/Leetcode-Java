package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/25.
 */
public class reOrderArray {
    public void reOrderArray(int[] array) {
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even[evenIndex++] = array[i];
            } else {
                odd[oddIndex++] = array[i];
            }
        }
        for (int i = 0; i < oddIndex; i++) {
            array[i] = odd[i];
        }
        for (int i = 0; i < evenIndex; i++) {
            array[oddIndex + i] = even[i];
        }
    }
}
