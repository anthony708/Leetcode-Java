package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/9/20.
 */

/*
    使用三次reverse函数
 */
public class Problem42LeftRotateString {
    public static String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String str1 = str.substring(0, n);
        String str2 = str.substring(n, str.length());
        return reverse(reverse(str1) + reverse(str2));
    }
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        char[] c = str.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        int n = 2;
        System.out.println(LeftRotateString(str, n));
    }
}
