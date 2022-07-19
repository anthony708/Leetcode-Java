package Math;

/**
 * 338. Counting Bits
 * Medium
 * @author zhuduan
 * 2019/06/06
 */

public class CountBits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            res[i] = res[i / 2];
            if (i % 2 == 0) {
                res[i]++;
            }
        }
        return res;
    }
}
