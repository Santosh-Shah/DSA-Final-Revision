package revision_once.arrays.easy;

public class Q6_SwapPairAlternatives {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10};
        swapPairAlternatives(arr);
        printArray(arr);
    }

    public static void swapPairAlternatives(int[] arr) {
        // Base case
        if (arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i = i + 2) {
                int target = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = target;
        }
    }

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
