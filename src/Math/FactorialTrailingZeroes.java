package Math;

/**
 * #172 Factorial Trailing Zeroes
 * Easy
 * @author zhuduan
 * 2018/10/10
 */

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
}
