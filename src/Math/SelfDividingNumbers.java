package Math;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * Easy
 * @author zhuduan
 * 2019/05/20
 */

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividedHelper(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean selfDividedHelper(int num) {
        int cur = num;
        while (cur != 0) {
            if (cur % 10 == 0 || num % (cur % 10) != 0) {
                return false;
            }
            cur /= 10;
        }
        return true;
    }
}
