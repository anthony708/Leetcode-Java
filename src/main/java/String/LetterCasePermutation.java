package String;

/**
 * 784. Letter Case Permutation
 * Easy
 * @author zhuduan
 * 2019/06/05
 */

import java.util.LinkedList;
import java.util.List;

public class LetterCasePermutation {

    // DFS Solution
    public List<String> letterCasePermutation(String S) {
        if (S == null) return new LinkedList<>();

        List<String> res = new LinkedList<>();
        helper(S.toCharArray(), res, 0);
        return res;
    }

    private void helper(char[] chs, List<String> list, int pos) {
        if (pos == chs.length) {
            list.add(new String(chs));
            return;
        }

        if (chs[pos] >= '0' && chs[pos] <= '9') {
            helper(chs, list, pos + 1);
            return;
        }

        chs[pos] = Character.toLowerCase(chs[pos]);
        helper(chs, list, pos + 1);

        chs[pos] = Character.toUpperCase(chs[pos]);
        helper(chs, list, pos + 1);
    }
}
