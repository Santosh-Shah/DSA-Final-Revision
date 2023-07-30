package array1;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 6};
        System.out.println("Sum of Array: " + sumOfArray(arr));
    }

    public static int sumOfArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
