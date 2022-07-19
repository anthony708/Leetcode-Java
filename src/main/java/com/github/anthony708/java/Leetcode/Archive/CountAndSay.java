package com.github.anthony708.java.LeetCode.Archive;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String cur = "1";
        for (int i = 1; i < n; i++) {
            cur = generateNext(cur);
        }
        return cur;
    }

    private static String generateNext(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str == "1") {
            return "11";
        }
        StringBuilder sb = new StringBuilder();
        int length = 1;
        char curChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == curChar) {
                length++;
                if (i == str.length() - 1) {
                    sb.append(length);
                    sb.append(curChar);
                    break;
                }
            } else {
                sb.append(length);
                sb.append(curChar);

                length = 1;
                if (i == str.length() - 1) {
                    sb.append(1);
                    sb.append(str.charAt(str.length()-1));
                    break;
                } else {
                    curChar = str.charAt(i);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(3));
//        System.out.println(generateNext("11"));
    }
}
