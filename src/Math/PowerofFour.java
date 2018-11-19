package Math;

/**
 * 342 Power of Four
 * Easy
 * @author zhuduan
 * 2018/11/19
 */

public class PowerofFour {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        double r = Math.log10(num) / Math.log10(4);
        if (r % 1 == 0) return true;
        else return false;
    }
}
