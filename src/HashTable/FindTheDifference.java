package HashTable;

/**
 * 389. Find the Difference
 * Easy
 * @author zhuduan
 * 2019/07/17
 */

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] tbls = new int[26];
        int[] tblt = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tbls[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            tblt[t.charAt(i) - 'a']++;
        }

        char c = '\0';
        for (int i = 0; i < 26; i++) {
            if (tbls[i] != tblt[i]) {
                c = (char)('a' + i);
            }
        }
        return c;
    }
}
