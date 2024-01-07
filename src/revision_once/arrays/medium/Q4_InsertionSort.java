package revision_once.arrays.medium;

public class Q4_InsertionSort {
    public static void main(String[] args) {
        // TODO: Bubble Sort
        int[] arr = {50, 6, 7, 2, 11, 8, 10, 30};
        insertionSort(arr);
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        if (arr == null) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }


    public static void printArray(int[] arr) {
        for (int output : arr) {
            System.out.print(output + " ");
        }
    }
}
