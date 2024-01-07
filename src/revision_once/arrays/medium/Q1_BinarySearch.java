package revision_once.arrays.medium;

import java.util.ArrayList;

public class Q1_BinarySearch {
    public static void main(String[] args) {
        // TODO: Binary Search for finding targeted value
        int[] arr = {5, 6, 7, 8, 10, 30};
        System.out.println("Present at index: " + binarySearch(arr, 7));
    }

    public static int binarySearch(int[] arr, int target) {
        // Base case
        if (arr == null) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
