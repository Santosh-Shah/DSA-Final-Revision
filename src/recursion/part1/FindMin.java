package recursion.part1;

public class FindMin {
    public static int findMin(int[] A, int n) {
        // add your code here
        // Base case
        if (n == 0) {
            return -1;
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + A[i];
        }

        if (sum % 2 == 0) {
            return count;
        }

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                A[i] = A[i] - 1;
                return 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(findMin(arr, arr.length));
    }
}
