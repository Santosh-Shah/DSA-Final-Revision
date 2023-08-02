package array2;

public class Q3_BubbleSort {
    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    // TODO: Main Function
    public static void main(String[] args) {
        // swap its alternative value if second value is lesser than first value
        // else leave as it, and at the end you will see all greater value present
        // TODO: Bubble Sort
        int[] arr = {5, 8, 60, 7, 8, 1, 10, 30, 2};
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
