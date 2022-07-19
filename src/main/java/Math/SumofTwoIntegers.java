package Math;

/**
 * #371 Sum of Two Integers
 * Easy
 * @author zhuduan
 * 2018/11/21
 */

public class SumofTwoIntegers {
    // You are not allowed to use the opperate + and -.
    private int getSum(int a, int b) {
        int res = a ^ b;
        int car = (a & b) << 1;
        if (car != 0) {
            return getSum(res, car);
        }
        return res;
    }
}
