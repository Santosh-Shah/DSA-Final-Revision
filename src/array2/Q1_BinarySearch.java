package array2;

public class Q1_BinarySearch {
    public static void main(String[] args) {
        // TODO: Binary Search for finding targeted value
        int[] arr = {5, 6, 7, 8, 10, 30};
        System.out.println("Present at index: " + binarySearch(arr, 10));
    }

    public static int binarySearch(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int mid = Integer.MIN_VALUE;

        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
