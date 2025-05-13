package hot100.Sort;

public class QuickSort_2 {
    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partition = partition(nums, low, high);
            quickSort(nums, low, partition - 1);
            quickSort(nums, partition + 1, high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int pointer = low;
        for (int i = low; i < high; i++) {
            if (nums[i] <= pivot) {
                swap(nums, i, pointer);
                pointer++;
            }
        }
        swap(nums, pointer, high);
        return pointer;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        QuickSort_2 quickSort = new QuickSort_2();
        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
