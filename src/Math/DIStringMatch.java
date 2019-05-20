package Math;

/**
 * 942. DI String Match
 * Easy
 * @author zhuduan
 * 2019/05/20
 */

public class DIStringMatch {
    public static int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int i = 0, j = S.length();
        for (int k = 0; k < S.length(); k++) {
            if (S.charAt(k) == 'I') {
                res[k] = i;
                i++;
            } else if (S.charAt(k) == 'D') {
                res[k] = j;
                j--;
            }
        }
        if (S.charAt(S.length() - 1) == 'I') {
            res[res.length - 1] = res[res.length - 2] + 1;
        } else if (S.charAt(S.length() - 1) == 'D') {
            res[res.length - 1] = res[res.length - 2] - 1;
        }

        return res;
    }

    public static void main(String[] args) {
        String S = "III";
        int[] res = diStringMatch(S);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
