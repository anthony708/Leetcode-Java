package HashTable;

/**
 * 953. Verifying an Alien Dictionary
 * Easy
 * @author zhuduan
 * 2019/07/17
 */

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int[] tbl = new int[26];
        for (int i = 0; i < order.length(); i++) {
            tbl[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];
            if (!isSorted(word1, word2, tbl)) return false;
        }
        return true;
    }

    private boolean isSorted(String word1, String word2, int[] tbl) {
        int length = Math.min(word1.length(), word2.length());

        if (word1.substring(0, length).equals(word2.substring(0, length))) {
            if (word1.length() > word2.length()) {
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                if (tbl[word1.charAt(i) - 'a'] > tbl[word2.charAt(i) - 'a']) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }
}
