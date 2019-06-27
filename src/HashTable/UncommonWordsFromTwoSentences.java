package HashTable;

/**
 * 884. Uncommon Words from Two Sentences
 * Easy
 * @author zhuduan
 * 2019/06/27
 */

import java.util.*;

public class UncommonWordsFromTwoSentences {
    public String [] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");

        for (String s: arrayA) {
            if (map.containsKey(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String s: arrayB) {
            if (map.containsKey(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            } else {
                map.put(s, 1);
            }
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
