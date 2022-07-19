package String;

import java.util.HashSet;

/**
 * 804. Unique Morse Code Words
 * Easy
 * @author zhuduan
 * 2019/05/29
 */

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String []morseTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();

        for (String word: words) {
            StringBuilder sb = new StringBuilder();
            for (char c: word.toCharArray()) {
                int index = c - 'a';
                sb.append(morseTable[index]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
