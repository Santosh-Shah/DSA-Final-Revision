package array1;

public class Q2 {
    public static void main(String[] args) {
        // TODO: find the largest element of the array
        int[] arr = {4, 3, 50, 6, 10, 1, 8};
        System.out.println("largest element of Array: " + largestElementOfArray(arr));
    }

    public static int largestElementOfArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
