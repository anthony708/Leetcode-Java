package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 500. Keyboard Row
 * Easy
 * @author zhuduan
 * 2019/06/13
 */

public class KeyboardRow {
    public String[] findWords(String[] words) {
        Set<Character> set1 = stringAddToSet("qwertyuiop");
        Set<Character> set2 = stringAddToSet("asdfghjkl");
        Set<Character> set3 = stringAddToSet("zxcvbnm");

        List<String> list = new ArrayList<>();

        for (String word: words) {
            if (isValid(word, set1) || isValid(word, set2) || isValid(word,set3)) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }

    private boolean isValid(String word, Set<Character> set) {
        for (char c: word.toCharArray()) {
            if (!set.contains(Character.toLowerCase(c)))
                return false;
        }
        return true;
    }

    private Set<Character> stringAddToSet(String str) {
        Set<Character> set = new HashSet<>();
        for (char c: str.toCharArray()) {
            set.add(c);
        }
        return set;
    }
}
