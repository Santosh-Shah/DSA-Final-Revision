package revision_once.arrays.medium;

public class Q2_SelectionSort {
    public static void main(String[] args) {
        // TODO: Selection Sort
        int[] arr = {5, 6, 7, 2, 1, 8, 10, 30};
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }


        for (int i = 0; i < arr.length - 1; i++) {
            int minV = Integer.MAX_VALUE;
            int minI = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minV) {
                    minV = arr[j];
                    minI = j;
                }
            }

            int temp = minV;
            arr[minI] = arr[i];
            arr[i] = temp;
        }
    }


    public static void printArray(int[] arr) {
        for (int output : arr) {
            System.out.print(output + " ");
        }
    }
}
