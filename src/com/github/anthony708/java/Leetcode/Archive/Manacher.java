package com.github.anthony708.java.Leetcode.Archive;

/**
 * Created by Anthony on 16/1/5.
 */

public class Manacher {

    private static String preProcess (String s) {
        if (s.length() == 0 ) return "^$" ;
        String result = "^" ;
        for ( int i = 0 ; i < s.length(); i++) {
            result += "#" + s.charAt(i);
        }
        result += "#$" ;
        return result;
    }

    public static void testGetLongestPalindrome (String s) {
        String result = Manacher.getLongestPalindrome(s);
        System.out.print(result);
    }

    public static String getLongestPalindrome (String s) {
        char [] S = preProcess(s).toCharArray();
        int n = S.length;
        int [] P = new int [n];
        int id = 0 , mx = 0 ;
        for ( int i = 1 ; i < n - 1 ; i++) {
            if ( i < mx ) {
                P[i] = Math.min(mx - i, P[2 * id - i]);
            } else {
                P[i] = 0 ;
            }
            while ( S[i + 1 + P[i]] == S[i - 1 - P[i]] )
                P[i]++;
            if ( i + P[i] > mx) {
                id = i;
                mx = i + P[i];
            }
        }
        int maxLen = 0 ;
        int centerIndex = 0 ;
        for ( int i = 1 ; i < n - 1 ; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        int beginIndex = (centerIndex - 1 - maxLen)/ 2 ;
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    public static void main (String[] args) {
        Manacher.testGetLongestPalindrome( "babcbabcbabcxa" );
    }
}