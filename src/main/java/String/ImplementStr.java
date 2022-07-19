package String;

/**
 * #28 Implement strStr()
 * Easy
 * @author zhuduan
 * 2018/09/14
 */

public class ImplementStr {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (isEqual(haystack, needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean isEqual(String haystack, String needle, int i) {
        int hl = haystack.length();
        int nl = needle.length();
        int j = 0;
        while (i < hl && j < nl) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return j >= nl;
    }
}
