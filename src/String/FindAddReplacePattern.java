package String;

/**
 * 890. Find and Replace Pattern
 * Medium
 * @author zhuduan
 * 2019/06/17
 */

import java.util.ArrayList;
import java.util.List;

public class FindAddReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (String word: words) {
            if (isMatch(word, pattern)) {
                list.add(word);
            }
        }
        return list;
    }

    private boolean isMatch(String word, String pattern) {
        int[] w = new int[26];
        int[] p = new int[26];

        for (int i = 0; i < word.length(); i++) {
            if (w[word.charAt(i) - 'a'] != p[pattern.charAt(i) - 'a']) {
                return false;
            }
            w[word.charAt(i) - 'a'] = i + 1;
            p[pattern.charAt(i) - 'a'] = i + 1;
        }
        return true;
    }
}
