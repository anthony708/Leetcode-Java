package com.github.anthony708.java.Leetcode.Archive;

public class CountPrimes {

    public static int countPrimes(int n) {
        int res = 0;
        for(int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                res++;
            }
        }
        return res;
    }
    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        int m = (int)Math.sqrt(num);
        for (int i = 2; i <= m; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
}
