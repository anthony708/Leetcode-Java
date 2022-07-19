package main.java.TopInterviewQuestions;

/*
    344. Reverse String
    Easy
    2019-07-26
 */

public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

    }
}
