package String;

import java.util.*;

/**
 * 17. Letter Combinations of a Phone Number
 * Medium
 * @author zhuduan
 * 2019/04/29
 */

public class LetterCombinationsofaPhoneNumber {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();

        combinations("", digits, 0, list);
        return list;
    }

    private void combinations(String prefix, String digits, int offset, List<String> list) {
        if (digits.length() <= offset) {
            list.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offset) - '0')];
        for (int i = 0; i < letters.length(); i++) {
            combinations(prefix + letters.charAt(i), digits, offset + 1, list);
        }
    }

    public static void main(String[] args) {

    }

}
