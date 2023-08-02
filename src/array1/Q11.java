package array1;

public class Q11 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: Find and return the total number of triples in the array/list which sum to target value.
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(tripleSum(arr, 12));
    }

    public static int tripleSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k]== target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
