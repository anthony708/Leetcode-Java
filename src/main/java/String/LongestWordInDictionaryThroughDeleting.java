package String;

/**
 * 524. Longest Word in Dictionary through Deleting
 * Medium
 * @author zhuduan
 * 2019/07/17
 */

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {

        String temp = "";
        for (String word: d) {
            if (temp.length() > word.length() || (temp.length() == word.length() && temp.compareTo(word) < 0)) {
                continue;
            }
            if (existInDictionary(s, word)) {
                temp = word;
            }

        }
        return temp;
    }

    private boolean existInDictionary(String s, String word) {
        int i = 0, j = 0;
        while (i < s.length() && j < word.length() && s.length() - i >= word.length() - j) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }

    public static void main(String[] args) {
        LongestWordInDictionaryThroughDeleting longestWordInDictionaryThroughDeleting = new LongestWordInDictionaryThroughDeleting();
        List<String> d = new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        String s = "abpcplea";

        System.out.println(longestWordInDictionaryThroughDeleting.findLongestWord(s, d));
        System.out.println("ab".compareTo("ba"));
    }
}
