package revision_once.arrays.hard;

public class Q4_LargestRowSum {
    public static void main(String[] args) {
        //TODO: print largest row sum
        int[][] arr = {
                {1, 4, 5},
                {2, 2, 4},
                {6, 9, 2}
        };

        System.out.println("Largest Row sum: " + largestRowSum(arr));
    }

    public static int largestRowSum(int[][] arr) {
       int largSum = 0;
       for (int[] row : arr) {
           int sum = 0;
           for (int elements : row) {
               sum += elements;
           }

           if (sum > largSum) {
               largSum = sum;
           }
       }

       return largSum;
    }
}
