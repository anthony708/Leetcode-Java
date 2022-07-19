package main.java.Array;

/**
 * 509. Fibonacci Number
 * Easy
 * @author zhuduan
 * 2019/06/013
 */

public class FibonacciNumber {
    public static int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        int n1 = 0;
        int n2 = 1;
        int res = 0;
        for (int i = 2; i <= N; i++) {
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println(fib(N));
    }
}
