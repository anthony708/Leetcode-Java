/*
 * @Author: Anthony
 * @Date: 2022-06-26 18:24:42
 * @LastEditTime: 2022-06-26 18:36:42
 */
package com.github.anthony708.java.Course;

public class BinarySearch {
    public static int binarySearchRecursive(int a[], int num, int left, int right) {
        int mid = left + ((right - left) >> 1);
        if (left > right) return -1; 
        if (a[mid] > num) {
            return binarySearchRecursive(a, num, left, mid - 1);
        } else if (a[mid] < num) {
            return binarySearchRecursive(a, num, mid + 1, right);
        } else {
            return mid;
        }
    }

    public static int binarySearchNonRecursive(int a[], int num) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (a[mid] > num) {
                right = mid - 1;
            } else if (a[mid] < num) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int num = 6;
        System.out.println(binarySearchNonRecursive(a, num));
        System.out.println(binarySearchRecursive(a, num, 0, a.length - 1));
    }
}
