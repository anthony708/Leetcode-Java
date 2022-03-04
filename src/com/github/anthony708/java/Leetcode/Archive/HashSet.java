package com.github.anthony708.java.LeetCode.Archive;

import java.util.Set;

/**
 * Created by Anthony on 15/11/10.
 */
public class HashSet {
    public static boolean DuplicateNumber(int nums[]) {

        Set hashSet = new java.util.HashSet();
        for(int num: nums) {
            if(hashSet.contains(num)) {
                return true;
            }else {
                hashSet.add(num);
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int[] array = {1,2,3,4,5};
        System.out.print(DuplicateNumber(array));
    }
}
