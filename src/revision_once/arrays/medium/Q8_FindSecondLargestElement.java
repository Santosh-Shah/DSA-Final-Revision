package revision_once.arrays.medium;

public class Q8_FindSecondLargestElement {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
// TODO: Q8) Find second largest element of the array and return it;
        int[] arr = {1, 3, 7, 101, 10, 102, 12, 100};
        System.out.println("Second Largest Element: " + secLargest(arr));

    }

    public static int secLargest(int[] arr) {
        // Base case
        if (arr == null) {
            return -1;
        }

        int larg = Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= larg) {
                secLarg = larg;
                larg = arr[i];
            }

            if (arr[i] < larg && arr[i] > secLarg) {
                secLarg = arr[i];
            }
        }

        return secLarg;
    }
}
