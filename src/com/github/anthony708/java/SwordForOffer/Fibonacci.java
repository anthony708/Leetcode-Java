package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/20.
 */
public class Fibonacci {
    public static int Finonacci(int n) {
        int fib0 = 0;
        int fib1 = 1;
        int fibn = 0;

        for (int i = 2; i <= n; i++) {
            fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
        }
        return fibn;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Finonacci(n));
    }
}
