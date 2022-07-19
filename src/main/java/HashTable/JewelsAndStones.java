package HashTable;

/**
 * 771. Jewels and Stones
 * Easy
 * @author zhuduan
 * 2019/05/24
 */

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        int[] jewels = new int[60];

        for (int i = 0; i < J.length(); i++) {
            jewels[J.charAt(i) - 'A']++;
        }

        for (int i = 0; i < S.length(); i++) {
            if (jewels[S.charAt(i) - 'A'] > 0) {
                res++;
            }
        }
        return res;
    }

}
