package array1;

public class Q7 {

    // printing array
    public static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO: find unique elements
        int[] arr = {5, 8, 5, 8, 4, 4, 1, 3, 3};
        System.out.println("Unique element: " + findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum = sum ^ j;
        }
        return sum;
    }
}
