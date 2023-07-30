package array1;

public class Q6 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO: swap all pairs with its alternative and then print all element
        int[] arr = {1, 2, 3, 6, 8};
        swapPairsAlternatives(arr);
        printArray(arr);
    }

    public static void swapPairsAlternatives(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
