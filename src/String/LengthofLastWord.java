package String;

/**
 * #59 Length of Last Word
 * Easy
 * @author zhuduan
 * 2018/09/12
 */

public class LengthofLastWord {
    public static int lengthofLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length-1].length();
    }
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.print(lengthofLastWord(s));
    }

}
