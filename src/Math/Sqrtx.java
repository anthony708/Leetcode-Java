package Math;

/**
 * #69 Sqrt(x)
 * Easy
 * @author zhuduan
 * 2018/10/08
 */

public class Sqrtx {
    public int mySqrt(int x) {
        long s = x;
        while (s * s > x) {
            s = (s + x / s )/ 2;
        }
        return (int)s;
    }
}
