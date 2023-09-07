package recursion.part2;

public class Q7_MergeSort {
    public static void main(String[] args) {
        int[] arr = {0, 3, 5, 70, 2, 29, 0, 1};
        mergeSort(arr);
        for (int ans : arr) {
            System.out.println(ans);
        }
    }

    // Method for Merge Sort
    public static void mergeSort(int[] arr) {
        // Base Case
        if (arr.length <= 1) {
            return;
        }

        int[] a = new int[arr.length/2];
        int[] b = new int[arr.length - a.length];

        // putting element into a array
        for (int i = 0; i < arr.length/2; i++) {
            a[i] = arr[i];
        }

        // putting element into b array
        for (int i = arr.length/2; i < arr.length; i++) {
            b[i - arr.length/2] = arr[i];
        }

        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }
    private static void merge(int[] a, int[] b, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        // it will run until any one of the array from a and b becomes blank
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            } else {
                arr[k] = b[j];
                j++;
                k++;
            }
        }

        // check if array a has some remaining elements
        while (i < a.length) {
            arr[k] = a[i];
            k++;
            i++;
        }

        // check if array b has some remaining elements
        while (j < b.length) {
            arr[k] = b[j];
            k++;
            j++;
        }
    }


}
