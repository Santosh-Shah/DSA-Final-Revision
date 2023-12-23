package array3;

public class Q6_BoundriesAndDiagonalSum {
    public static void main(String[] args) {
        //TODO: print sum of boundaries and diagonals
        int[][] arr = {
                {1, 3, 2},
                {4, 5, 6},
                {7, 9, 8}
        };

        boundriesAndDiagonalSum(arr);
    }

    public static void boundriesAndDiagonalSum(int[][] arr) {
        int len = arr.length;
        int totalSum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                // sum for all diagonals
                if (i == j || (i + j) == len - 1) {
                    totalSum = totalSum + arr[i][j];
                } else if (i == 0 || j == 0 || i == len - 1 || j == len - 1) {
                    totalSum = totalSum + arr[i][j];
                }
            }
        }

        System.out.println(totalSum);
    }
}
