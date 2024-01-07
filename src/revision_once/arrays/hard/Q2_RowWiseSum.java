package revision_once.arrays.hard;

public class Q2_RowWiseSum {
    public static void main(String[] args) {
        //TODO: print row wise sum
        int[][] arr = {
                {1, 2, 3, 6},
                {11, 22},
                {5, 4, 1}
        };

        rowWiseSum(arr);
    }

    public static void rowWiseSum(int[][] arr) {
        for (int[] row : arr) {
            int sum = 0;
            for (int elements : row) {
                sum += elements;
            }
            System.out.print(sum + " ");
        }
    }
}
