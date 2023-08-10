package array3;

public class Q3_LargestColumnSum {
    public static void main(String[] args) {
        //TODO: print largest column sum
        int[][] arr = {
                {1, 4, 5},
                {2, 2, 4},
                {6, 9, 2}
        };

        System.out.println("Largest column sum: " + largestColumnSum(arr));
    }

    public static int largestColumnSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largestSum = 0;
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            if (sum >= largestSum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }
}
