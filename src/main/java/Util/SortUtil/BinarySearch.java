package Util.SortUtil;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high) {

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target == arr[middle]) {
                return middle;
            } else if (target < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,9};
        System.out.print(binarySearch(arr, 6, 0, args.length - 1));
    }
}
