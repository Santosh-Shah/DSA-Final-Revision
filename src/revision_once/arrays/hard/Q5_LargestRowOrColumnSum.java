package revision_once.arrays.hard;

public class Q5_LargestRowOrColumnSum {
    public static void main(String[] args) {
        //TODO: print largest Row or column sum
        int[][] arr = {
                {1, 4, 5},
                {20, 20, 40},
                {600, 900, 2}
        };

        largestRowOrColumnSum(arr);
    }

    public static void largestRowOrColumnSum(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int largSum = 0;
        int rcIndexC = 0;
        boolean rowT = true;

        // finding a largest row sum
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                sum += arr[i][j];
            }

            if (sum > largSum) {
                largSum = sum;
                rcIndexC = i;
            }
        }

        // finding largest column sum
        for (int j = 0; j < column; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
            }

            if (sum > largSum) {
                largSum = sum;
                rcIndexC = j;
                rowT = false;
            }
        }

        // comparing which one has largest
        if (rowT) {
            System.out.println("Row: " + rcIndexC + " " + largSum);
        } else {
            System.out.println("Column: " + rcIndexC + " " + largSum);
        }


    }
}
