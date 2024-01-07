package revision_once.arrays.medium;

public class Q3_BubbleSort {
    public static void main(String[] args) {
        // TODO: Bubble Sort
        int[] arr = {50, 6, 7, 2, 11, 8, 10, 30};
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null) {
            return;
        }


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


    public static void printArray(int[] arr) {
        for (int output : arr) {
            System.out.print(output + " ");
        }
    }
}
