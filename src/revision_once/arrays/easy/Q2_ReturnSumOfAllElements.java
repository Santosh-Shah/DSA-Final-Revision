package revision_once.arrays.easy;

public class Q2_ReturnSumOfAllElements {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2};
        System.out.println("Sum of array's Elements: " + sumOfElements(arr));

    }

    public static int sumOfElements(int[] arr) {
        // Base case
        if (arr.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int j : arr) {             // It is for each loop
            sum = sum + j;
        }
        return sum;
    }
}
