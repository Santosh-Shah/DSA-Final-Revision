package array1;

public class Q8 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: find duplicates elements
        int[] arr = {5, 6, 7, 8, 2, 10, 2};
        System.out.println("Duplicate element: " + findDuplicateElement(arr));
    }

    public static int findDuplicateElement(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[j];
                    return ans;
                }
            }
        }
        return -1;
    }
}
