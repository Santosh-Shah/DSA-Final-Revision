package array1;

public class Q10 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: Find and return the total number of pairs in the array/list which sum to target value.
        int[] arr = {2, 3, 4, 5, 1};
        System.out.println(pairSum(arr, 5));
    }

    public static int pairSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
