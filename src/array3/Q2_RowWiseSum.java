package array3;

public class Q2_RowWiseSum {
    public static void main(String[] args) {
        //TODO: print row wise sum
        int[][] arr = {
                {1, 2, 3},
                {11, 22},
                {5, 4, 1}
        };

        rowWiseSum(arr);
    }

    public static void rowWiseSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
