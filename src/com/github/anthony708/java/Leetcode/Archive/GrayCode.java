package com.github.anthony708.java.LeetCode.Archive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 15/11/27.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = (int) Math.pow(2.0, n);
        list.add(0);
        for (int i = 1; i < num; i++){
            list.add((i / 2) ^ i);
        }
        return list;
    }

    public static void main(String[] args) {
        GrayCode test = new GrayCode();
        System.out.print(test.grayCode(5));

    }
}
