package com.github.anthony708.java.LeetCode.Archive;

/**
 * Created by Anthony on 15/11/19.
 */
public class BinarySearch {
    int binarySearchRecursive(int a[], int low, int high, int key) {
        if(low > high) return -(low + 1);

        int mid = low + (high - low) / 2;
        if(key < a[mid]) {
            return binarySearchRecursive(a, low, high - 1, key);
        } else if (key > a[mid]) {
            return binarySearchRecursive(a, mid + 1, high, key);
        } else {
            return mid;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,5,6};
        int key = 9;
        System.out.println(binarySearch(a, key));
    }
}
