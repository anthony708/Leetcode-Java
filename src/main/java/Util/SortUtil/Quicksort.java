package main.java.Util.SortUtil;

import static main.java.Util.Swap.swap;

public class Quicksort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partition(arr, left,right);
            quickSort(arr, left,index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (pivot > arr[left]) {
                left++;
            }
            while (pivot < arr[right]) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                if (arr[left] == arr[right]) {
                    left++;
                }
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,4,2,7,5,8,6};
        quickSort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
