package array3;

public class Q7_PrintLikeWave {
    public static void main(String[] args) {
        //TODO: print largest column sum
        int[][] arr = {
                {1, 3, 2},
                {4, 5, 6},
                {7, 9, 8}
        };

        printLikeWave(arr);
    }

    public static void printLikeWave(int[][] arr) {
        int row = arr.length;
        int colm = arr[0].length;

        // base case check
        if (row == 0) {
            return;
        }

        for (int j = 0; j < colm; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
