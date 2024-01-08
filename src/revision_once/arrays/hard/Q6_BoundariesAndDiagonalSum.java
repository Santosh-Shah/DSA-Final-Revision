package revision_once.arrays.hard;

public class Q6_BoundariesAndDiagonalSum {
    public static void main(String[] args) {
        //TODO: print sum of boundaries and diagonals
        int[][] arr = {
                {1, 3, 2},
                {4, 8, 6},
                {7, 9, 8}
        };

        boundariesAndDiagonalSum(arr);
    }

    public static void boundariesAndDiagonalSum(int[][] arr) {
        int len = arr.length;
        int totalSum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || (i + j) == len - 1) {
                    totalSum += arr[i][j];
                } else if (i == 0 || j == 0 || i == len - 1 || j == arr[i].length - 1) {
                    totalSum += arr[i][j];
                }
            }
        }


        System.out.println(totalSum);
    }
}
