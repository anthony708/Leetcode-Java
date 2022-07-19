package com.github.anthony708.java.Huawei;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Anthony on 16/9/28.
 */
public class RandomProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(in.nextInt());
            }
            int length = set.size();
            int[] array = new int[length];
            int j = 0;
            for (int k : set) {
                array[j] = k;
                j++;
            }
            Arrays.sort(array);
            for (int value : array) {
                System.out.println(value);
            }
        }
    }
}
