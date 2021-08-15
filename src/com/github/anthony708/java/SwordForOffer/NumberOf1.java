package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/20.
 */


/*
    将n与(n-1)取"与"可以把n中最后一个"1"变为"0", 那么有多少个1就循环几次.
 */

public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
