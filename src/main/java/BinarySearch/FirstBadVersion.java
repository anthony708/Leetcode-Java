package main.java.BinarySearch;

import main.java.Util.VersionControl;

/**
 * #278 First Bad Version
 * Easy
 * @author zhuduan
 * 2018/11/15
 */

public class FirstBadVersion extends VersionControl {
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
