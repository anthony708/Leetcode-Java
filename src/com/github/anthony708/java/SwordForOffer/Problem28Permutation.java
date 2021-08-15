package com.github.anthony708.java.SwordForOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Anthony on 16/9/8.
 */

/*
    输入一个字符串,按字典序打印出该字符串中字符的所有排列。
        固定第一个字符，递归取得首位后面的各种字符串组合；
        再把第一个字符与后面每一个字符交换，并同样递归获得首位后面的字符串组合
 */

public class Problem28Permutation {
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) return list;
        char[] cs = str.toCharArray();
        permutation(cs, 0);
        Collections.sort(list);
        return list;
    }
    private void permutation(char[] cs, int begin) {
        if (begin == cs.length - 1) {
            String s = new String(cs);
            if (!list.contains(s))  {
                list.add(s);
            }
        } else {
            for (int i = begin; i < cs.length; i++) {
                swap(cs, begin, i);
                permutation(cs, begin + 1);
                swap(cs, begin, i);
            }
        }
    }
    private void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
