package array2;

public class Q2_SectionSort {
    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    // TODO: Main Function
    public static void main(String[] args) {
        // TODO: Selection Sort
        int[] arr = {5, 60, 7, 8, 1, 10, 30};
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < len; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            int temp = minValue;
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
