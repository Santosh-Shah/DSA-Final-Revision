package revision_once.arrays.easy;

public class Q3_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 3, 50, 6, 10, 1, 8};
        System.out.println("Index: " + linearSearch(arr, 10));
    }

    public static int linearSearch(int[] arr, int target) {
        // Base case
        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
