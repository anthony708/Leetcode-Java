package Math;

/**
 * #7 Reverse Integer
 * Easy
 * @author zhuduan
 * 2018/09/27
 */

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}
