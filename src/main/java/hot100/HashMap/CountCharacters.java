package hot100.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    private static void countCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char mostFrequentCharacter = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentCharacter = entry.getKey();
            }
        }

        System.out.println(maxCount);
        System.out.println(mostFrequentCharacter);
    }

    public static void main(String[] args) {
        String str = "$71123aaaaaayiooooo";
        countCharacters(str);   
    }
}
