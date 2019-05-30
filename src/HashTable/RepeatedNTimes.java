package HashTable;

import java.util.HashSet;

/**
 * 961. N-Repeated Element in Size 2N Array
 * Easy
 * @author zhuduan
 * 2019/05/30
 */

public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int a: A) {
            if (!set.contains(a)) {
                set.add(a);
            } else {
                return a;
            }
        }
        return -1;
    }
}
