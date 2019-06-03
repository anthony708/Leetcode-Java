package BinarySearch;

/**
 * 1011. Capacity To Ship Packages Within D Days
 * Medium
 * @author zhuduan
 * 2019/06/03
 */

public class CapacityToShipPackageWithinDDays {
    public static int shipWithinDays(int[] weights, int D) {

        int l = 0, r = 0;

        // 首先使l为weights中最大的数, 而r成为weights所有数字之和.
        for (int w: weights) {
            l = Math.max(w, l);
            r += w;
        }

        // 建立二分法, 每次以mid为传送带负载, 验证天数是否为D.
        // 若天数小于D, 说明负载过大, 则r变成mid的值, 使负载缩小
        // 若天数大于D, 说明负载过小, 则l变为mid+1的值

        while (l < r) {
            int mid = l + (r - l) / 2, need = 1, cur = 0;
            for (int w:weights) {
                if (cur + w > mid) {
                    need++;
                    cur = 0;
                }
                cur += w;
            }
            if (need > D) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        System.out.println(shipWithinDays(weights, D));
    }
}
