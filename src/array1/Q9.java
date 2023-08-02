package array1;

public class Q9 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: print the intersection of arrays II
        int[] arr1 = {5, 7, 8, 4, 3, 9};
        int[] arr2 = {7, 5, 0, 10, 3};
        printIntersection(arr1, arr2);
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (i == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
