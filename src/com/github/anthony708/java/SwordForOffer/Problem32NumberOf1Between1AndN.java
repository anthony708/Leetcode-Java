package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/5/20.
 */

/*
    从1到n整数中1出现的次数
 */
public class Problem32NumberOf1Between1AndN {
    public static int NumberOf1(int n) {
        int count = 0;
        while (n > 0) {
            String str = String.valueOf(n);
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1') {
                    count++;
                }
            }
            n--;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 321;
        System.out.println(NumberOf1(n));
    }
}
