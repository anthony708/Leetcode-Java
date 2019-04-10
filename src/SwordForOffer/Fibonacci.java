package SwordForOffer;

/*
Problem 9
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
 */

public class Fibonacci {
    private static int fibonacci(int n) {
        int result = 0;
        int n1 = 1;
        int n2 = 0;
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }
}
