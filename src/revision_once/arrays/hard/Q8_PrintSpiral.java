package revision_once.arrays.hard;

public class Q8_PrintSpiral {
    public static void main(String[] args) {
        //TODO: print spiral
        int[][] arr = {
                {1, 3, 2},
                {4, 5, 6},
                {7, 9, 8}
        };

        printSpiral(arr);
    }

    public static void printSpiral(int[][] arr) {
        // Base case
        if (arr.length == 0) {
            return;
        }

        int maxR = arr.length;
        int minR = 0;
        int maxC = arr[0].length;
        int minC = 0;
        int count = 0;
        int totalNumC = maxC * maxR;

        while (count < totalNumC) {

            // it will print first row elements
            for (int i = minR, j = minC; j < maxC && count < totalNumC; j++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minR++;

            // it will print last column's elements
            for (int i = minR, j = maxC - 1; i < maxR && count < totalNumC; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxC--;

            // it will print last row's elements
            for (int i = maxR - 1, j = maxC - 1; j >= minC && count < totalNumC; j--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxR--;

            for (int i = maxR - 1, j = minC; i >= minR && count < totalNumC; i--) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minC++;

        }
    }
}
