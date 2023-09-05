package recursion.part1;

public class Q8_ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 70};
        System.out.println(arraySum(arr));
    }

    // Array sum
    public static int arraySum(int[] arr) {
        return sum(arr, 0);
    }

    public static int sum(int[] arr, int startIndex) {
        if (startIndex == arr.length) {
            return 0;
        }
        int smallOutput = sum(arr, startIndex + 1);
        return arr[startIndex] + smallOutput;
    }
}
