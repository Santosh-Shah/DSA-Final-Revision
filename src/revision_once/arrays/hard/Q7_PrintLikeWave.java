package revision_once.arrays.hard;

public class Q7_PrintLikeWave {
    public static void main(String[] args) {
        //TODO: print like wave
        int[][] arr = {
                {1, 3, 2},
                {4, 5, 6},
                {7, 9, 8},
                {40, 50, 60},
                {70, 90, 80},
                {700, 900, 800}
        };

        printLikeWave(arr);
    }

    public static void printLikeWave(int[][] arr) {
        int row = arr.length;
        int colm = arr[0].length;

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
