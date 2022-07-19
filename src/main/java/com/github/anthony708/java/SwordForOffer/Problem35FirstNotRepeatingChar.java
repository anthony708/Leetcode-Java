package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/6/15.
 */

/*
    在一个字符串中找到第一个只出现一次的字符,并返回它的位置

 */

public class Problem35FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() <= 0) return -1;
        int[] count = new int[26];
        char c = 'A';
        if (str.charAt(0) >= 'a') {
            c = 'a';
        }
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - c]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
