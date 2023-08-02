package array1;

public class Q12 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: sort 0 1.
        int[] arr = {1, 1, 0, 1, 0, 0, 1};
        sortZeroOne(arr);
        printArray(arr);
    }

    public static void sortZeroOne(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            while (arr[start] == 0 && start < end) {
                start++;
            }

            while (arr[end] == 1 && start < end) {
                end--;
            }

            if (start < end) {
                arr[start] = 0;
                arr[end] = 1;
                start++;
                end--;
            }
        }
    }
}
