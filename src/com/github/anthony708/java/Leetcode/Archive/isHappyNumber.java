package com.github.anthony708.java.Leetcode.Archive;

/**
 * Created by Anthony on 15/11/26.
 */
public class isHappyNumber {
    public boolean isHappyNumber(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        java.util.HashSet set = new java.util.HashSet();
        int m = 0;
        while (true) {
            while (n != 0) {
                m = m + (n % 10) * (n % 10);
                n = n / 10;
            }
            if (m == 1) {
                return true;
            }
            if(set.contains(m)) {
                return false;
            } else {
                set.add(m);
            }
            n = m;
            m = 0;
        }
    }
}
