package revision_once.arrays.hard;

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
        int row = arr.length;
        int column = arr[0].length;
        int largSum = 0;
        for (int j = 0; j < column; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
            }

            if (sum > largSum) {
                largSum = sum;
            }
        }

        return largSum;
    }
}
