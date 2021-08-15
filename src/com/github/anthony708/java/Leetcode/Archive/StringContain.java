package com.github.anthony708.java.Leetcode.Archive;

import java.util.*;
import java.util.HashSet;

/**
 * Created by Anthony on 15/12/30.
 */
public class StringContain {
    public boolean StringContains(String a, String b) {
        Set hashSet = new HashSet();
        for (int i = 0; i < a.length(); i++) {
            hashSet.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            if (!hashSet.contains(b.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringContain test = new StringContain();
        System.out.println(test.StringContains("ABCD", "ABC"));
    }
}
